package com.uek.airline.config;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Map;

//@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE").maxAge(360000).allowCredentials(true);
        super.addCorsMappings(registry);
    }

    /**
     * 解决跨域问题覆盖默认的SpringMVC配置，会导致Swagger2框架的页面赵不到故而需要加入该配置解决路径访问的问题
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/assets/");
        super.addResourceHandlers(registry);
    }


}
