package com.node.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//spring boot启动的入口类
@SpringBootApplication  //开启spring boot配置
public class Application {
    //代码spring boot项目代码必须放在Application类所在同级目录或下级目录

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
