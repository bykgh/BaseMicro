package com.yk.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author yikai.bi
 * @create 2023年07月26日14:21:04
 * @email bykxl@sina.com
 * @since 网关配置
 */
@Configuration
public class GatewayConfig {

    /**
     * 配置全局解决zuul服务中的cors跨域问题
     * @return org.springframework.web.filter.CorsFilter
     */
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        //↓核心代码
        corsConfiguration.addExposedHeader("Authorization");
        corsConfiguration.addExposedHeader("domain");
        corsConfiguration.addExposedHeader("token");
        corsConfiguration.addExposedHeader("Content-Type");
        corsConfiguration.addExposedHeader("Content-Disposition");
        corsConfiguration.addExposedHeader("X-Requested-With");
        corsConfiguration.addExposedHeader("accept");
        corsConfiguration.addExposedHeader("Origin");
        corsConfiguration.addExposedHeader("Access-Control-Request-Method");
        corsConfiguration.addExposedHeader("Access-Control-Request-Headers");

        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }

}
