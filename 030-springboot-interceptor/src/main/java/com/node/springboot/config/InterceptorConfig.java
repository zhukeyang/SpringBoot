package com.node.springboot.config;


import com.node.springboot.interceptor.UserInterceptor;
import com.node.springboot.model.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //定义此类为配置类(即相当于之前的xml配置文件)
public class InterceptorConfig  implements WebMvcConfigurer {


    //mvc:interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor((WebRequestInterceptor) new UserInterceptor());
    }
}
