package com.atguigu.spzx.manager.controller;

import com.atguigu.spzx.common.log.annotation.Log;
import com.atguigu.spzx.common.log.enums.OperatorType;
import com.atguigu.spzx.manager.service.BrandService;
import com.atguigu.spzx.model.entity.product.Brand;
import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import com.github.pagehelper.PageInfo;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/admin/product/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/findAll")
    public Result findAll() {
        List<Brand> list = brandService.findAll();
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        brandService.deleteById(id);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @PutMapping("/updateById")
    public Result updateById(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }
    @Log(title = "品牌管理:列表", businessType = 0, operatorType = OperatorType.OTHER)
    @GetMapping("/{page}/{limit}")
    public Result list(@PathVariable Integer page,
                       @PathVariable Integer limit) {
        PageInfo<Brand> pageInfo = brandService.findByPage(page, limit);
        return Result.build(pageInfo, ResultCodeEnum.SUCCESS);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Brand brand){
        brandService.save(brand);
        return Result.build(null, ResultCodeEnum.SUCCESS);
    }
}
