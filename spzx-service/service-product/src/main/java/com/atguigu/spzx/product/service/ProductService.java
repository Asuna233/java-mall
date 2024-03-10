package com.atguigu.spzx.product.service;

import com.atguigu.spzx.model.dto.h5.ProductSkuDto;
import com.atguigu.spzx.model.entity.product.ProductSku;
import com.atguigu.spzx.model.vo.h5.ProductItemVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductService {
    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);

    List<ProductSku> findProductSkuBySale();

    ProductItemVo item(Long skuId);

    ProductSku getBySkuId(Long skuId);
}
