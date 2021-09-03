package com.atguigu.mybatis_plus_test.config;

import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.atguigu.mybatis_plus_test.mapper")
public class MpConfig {
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor()
    {
        return new OptimisticLockerInnerInterceptor();
    }
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor()
    {
        return new PaginationInnerInterceptor();
    }
}
