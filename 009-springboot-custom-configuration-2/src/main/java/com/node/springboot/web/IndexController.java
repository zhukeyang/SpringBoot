package com.node.springboot.web;

import com.node.springboot.config.Abc;
import com.node.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private School school;
    @Autowired
    private Abc abc;
    @RequestMapping("/say")
    @ResponseBody
    public String say()
    {
        return "学校名称="+school.getName()+"school.websit"+school.getWebsit()+"  "+abc.getName();
    }
}
