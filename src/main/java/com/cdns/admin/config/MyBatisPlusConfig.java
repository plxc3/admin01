package com.cdns.admin.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackgeName: com.cdns.admin.config
 * @ClassName: MyBatisPlus
 * @Author: plxc
 * Date: 2020/6/26 16:46
 * project name: admin
 * @Version:
 * @Description:MyBatis-Plus配置
 */
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
