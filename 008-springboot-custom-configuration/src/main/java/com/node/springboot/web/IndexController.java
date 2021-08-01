package com.node.springboot.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @RequestMapping("/say")
    @ResponseBody
    public String say()
    {

        return "Hello"+schoolName;
    }
}
