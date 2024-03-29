package com.atguigu.spzx.manager.config;

import com.atguigu.spzx.manager.interceptor.LoginAuthInterceptor;
import com.atguigu.spzx.manager.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor;

    @Autowired
    private UserProperties userProperties;

    //拦截器注册
    //会把Swagger拦截，调试需要注释一下
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginAuthInterceptor)
////                .excludePathPatterns("/admin/system/index/login" , "/admin/system/index/generateValidateCode")
//                .excludePathPatterns(userProperties.getNoAuthUrls())
//                .addPathPatterns("/**");
    }

    //跨域访问
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowCredentials(true).allowedOriginPatterns("*").allowedMethods("*").allowedHeaders("*");
    }
}
