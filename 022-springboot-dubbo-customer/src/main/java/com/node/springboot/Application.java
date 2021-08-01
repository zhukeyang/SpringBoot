package com.node.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfigBinding;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开启spring注解配置
@EnableDubboConfiguration//开启dubbo注解配置
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
