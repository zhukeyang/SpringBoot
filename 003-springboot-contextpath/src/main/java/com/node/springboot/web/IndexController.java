package com.node.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/say")
    @ResponseBody
    public String sqy()
    {
        return "say";
    }


    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String,Object> mapvalue()
    {
        Map<String,Object> retMap=new HashMap<String,Object>();
        retMap.put("message","SpringBoot Project");
        return retMap;
    }
}
