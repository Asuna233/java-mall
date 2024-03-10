package com.atguigu.spzx.pay;

import com.atguigu.spzx.common.anno.EnableUserWebMvcConfiguration;
import com.atguigu.spzx.pay.properties.AlipayProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {
        "com.atguigu.spzx.feign.order"
})
@EnableConfigurationProperties(value = { AlipayProperties.class })
@EnableUserWebMvcConfiguration
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class , args) ;
    }
}
