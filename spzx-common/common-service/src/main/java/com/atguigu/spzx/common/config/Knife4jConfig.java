package com.atguigu.spzx.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {

    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder().group("user-api").pathsToMatch("/api/**").build();
    }

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder().group("admin-api").pathsToMatch("/admin/**").build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("API接口文档").version("1.0").description("API接口文档").contact(new Contact().name("atguigu")));
    }
}
