package com.node.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

//        SpringApplication.run(Application.class, args);
        //获取启动入口spring boot类
          SpringApplication springApplication=new  SpringApplication(Application.class);
          //设置他的属性
          springApplication.setBannerMode(Banner.Mode.OFF);
          springApplication.run(args);
    }

}
