package com.node.springboot.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.node.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;


    @RequestMapping(value = "/student/count")
    @ResponseBody
    public Object studentCount()
    {
        Integer allStudentCount = studentService.queryAllStudentCount();
        return "学生总人数为："+allStudentCount;
    }

}
