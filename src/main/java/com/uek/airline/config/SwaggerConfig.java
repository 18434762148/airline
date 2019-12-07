package com.uek.airline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2接口文档框架配置
 * @author yzy
 */
@Configuration
@EnableSwagger2    // 启动Swagger2接口文档的拦截功能，生成接口API
public class SwaggerConfig {
//     Docket
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.uek.airline.controller")).paths(PathSelectors.any()).build();
    }
//  创建该API的基本信息(这些基本信息会展现在文档页面中)
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("SpringBoot利用Swagger构建API文档").description("文档").version("1.0").build();
    }

}
