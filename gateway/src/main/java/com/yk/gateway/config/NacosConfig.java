package com.yk.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yikai.bi
 * @create 2023年07月26日14:21:04
 * @email bykxl@sina.com
 * @since 过滤器配置参数
 */
@Service
@RefreshScope
@ConfigurationProperties(prefix = "prefilter")
public class NacosConfig {
    /**
     * 不需要拦截的路径列表
     */
    private  List<String> excludePathList;

    /**
     * 登录后就可以访问的路径列表
     */
    private  List<String> loginPathList;

    public void setExcludePathList(List<String> excludePathList) {
        this.excludePathList = excludePathList;
    }

    public void setLoginPathList(List<String> loginPathList) {
        this.loginPathList = loginPathList;
    }

    @Bean
    public List<String> excludePathListBean(){
        return  excludePathList;
    }

    @Bean
    public List<String> loginPathListBean(){
        return loginPathList;
    }


}
