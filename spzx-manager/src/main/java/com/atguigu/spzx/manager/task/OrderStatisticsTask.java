package com.atguigu.spzx.manager.task;

import cn.hutool.core.date.DateUtil;
import com.atguigu.spzx.manager.mapper.OrderInfoMapper;
import com.atguigu.spzx.manager.mapper.OrderStatisticsMapper;
import com.atguigu.spzx.model.entity.order.OrderStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class OrderStatisticsTask {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderStatisticsMapper orderStatisticsMapper;
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void testHello() {
//        System.out.println(new Date().toInstant());
//    }
//    @Scheduled(cron = "0/10 * * * * ?")

    @Scheduled(cron = "0 0 2 * * ?")
    public void orderTotalAmountStatistics() {
        System.out.println(new Date().toInstant());
        String createTime = DateUtil.offsetDay(new Date(), -1).toString(new SimpleDateFormat("yyyy-MM-dd"));
        OrderStatistics orderStatistics = orderInfoMapper.selectOrderStatistics(createTime);
        if(orderStatistics != null) {
            orderStatisticsMapper.insert(orderStatistics) ;
        }
    }
}
