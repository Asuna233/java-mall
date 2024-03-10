package com.atguigu.spzx.manager.controller;

import cn.hutool.http.server.HttpServerResponse;
import com.atguigu.spzx.manager.service.CategoryService;
import com.atguigu.spzx.model.entity.product.Category;
import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value="/admin/product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/importData")
    public Result importData(MultipartFile file) {
        categoryService.importData(file);
        return Result.build(null, ResultCodeEnum.SUCCESS);
    }

    @GetMapping("/exportData")
    public void exportData(HttpServletResponse response) {
        categoryService.exportData(response);
    }

    @GetMapping("/findCategoryList/{id}")
    public Result findCategoryList(@PathVariable Long id) {
        List<Category> list = categoryService.findCategoryList(id);
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }
}
