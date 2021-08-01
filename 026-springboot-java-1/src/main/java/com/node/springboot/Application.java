package com.node.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    //spring boot程序启动后，返回值是ConfigurableApplicationContext，
    //也是spring容器，相当于原来spring容器中启动容器ClasspathXmlApplicationContext


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
