package com.atguigu.spzx.manager.listener;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.atguigu.spzx.manager.mapper.CategoryMapper;

import com.atguigu.spzx.model.vo.product.CategoryExcelVo;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public class ExcelListener<T> implements ReadListener<T> {

    private CategoryMapper categoryMapper;

    private static final int BATCH_COUNT = 100;

    private List<T> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
    public ExcelListener(CategoryMapper categoryMapper){
        this.categoryMapper = categoryMapper;
    }


    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        cachedDataList.add(t);
        if (cachedDataList.size() >= BATCH_COUNT) {
            saveData();
            cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }
    }

    private void saveData() {
        categoryMapper.batchInsert((List< CategoryExcelVo >) cachedDataList);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
    }
}

