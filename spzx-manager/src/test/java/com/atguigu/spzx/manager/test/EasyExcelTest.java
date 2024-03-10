package com.atguigu.spzx.manager.test;

import com.alibaba.excel.EasyExcel;
import com.atguigu.spzx.model.vo.product.CategoryExcelVo;

import java.util.ArrayList;
import java.util.List;

public class EasyExcelTest {
    public static void main(String[] args) {
        write();
    }

    public static void read() {
        String fileName = "D://01.xlsx";
        ExcelListener excelListener = new ExcelListener();
        EasyExcel.read(fileName, CategoryExcelVo.class, excelListener).sheet().doRead();
        List<CategoryExcelVo> data = excelListener.getData();
        System.out.println(data);
    }

    public static void write() {
        List<CategoryExcelVo> list = new ArrayList<>();
        list.add(new CategoryExcelVo(1L, "数码办公", "", 0L, 1, 1));
        list.add(new CategoryExcelVo(11L, "华为手机", "", 1L, 1, 2));
        EasyExcel.write("D://02.xlsx", CategoryExcelVo.class).sheet("分类数据").doWrite(list);
    }
}
