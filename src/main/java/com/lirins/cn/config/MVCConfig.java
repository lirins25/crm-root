package com.lirins.cn.config;

import org.springframework.context.annotation.Configuration;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @version 0.1
 * @ClassName:MVCConfig
 * @Description:
 * @date: 2021/1/5
 * @since JDK 1.8
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(false)
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("*");

    }}



