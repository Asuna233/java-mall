package com.atguigu.spzx.manager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.unit.DataUnit;
import com.atguigu.spzx.common.exception.GuiguException;
import com.atguigu.spzx.manager.properties.MinioProperties;
import com.atguigu.spzx.manager.service.FileUploadService;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import io.minio.*;
import io.minio.errors.MinioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;

@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    private MinioProperties minioProperties;
    @Override
    public String upload(MultipartFile file) {
        try {
            // Create a minioClient with the MinIO server playground, its access key and secret key.
            MinioClient minioClient =
                    MinioClient.builder()
                            .endpoint(minioProperties.getEndpointUrl())
                            .credentials(minioProperties.getAccessKey(), minioProperties.getSecreKey())
                            .build();

            // Make 'asiatrip' bucket if not exist.
            boolean found =
                    minioClient.bucketExists(BucketExistsArgs.builder().bucket(minioProperties.getBucketName()).build());
            if (!found) {
                // Make a new bucket called 'spzx-bucket'.
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(minioProperties.getBucketName()).build());
            } else {
                System.out.println("Bucket 'spzx-bucket' already exists.");
            }

            // Upload '/home/user/Photos/asiaphotos.zip' as object name 'asiaphotos-2015.zip' to bucket
            // 'spzx-bucket'.
            // Upload known sized input stream.
            String dateDir = DateUtil.format(new Date(), "yyyyMMdd");

            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            String filename = dateDir+ "/" + uuid + file.getOriginalFilename();
            minioClient.putObject(
                    PutObjectArgs.builder().bucket(minioProperties.getBucketName()).object(filename).stream(
                                    file.getInputStream(), file.getSize(), -1)
                            .build());
            String url =  minioProperties.getEndpointUrl()+"/"+minioProperties.getBucketName()+"/"+filename;
            return url;
        } catch (Exception e) {
            e.printStackTrace();
            throw new GuiguException(ResultCodeEnum.SYSTEM_ERROR);
        }
    }
}
