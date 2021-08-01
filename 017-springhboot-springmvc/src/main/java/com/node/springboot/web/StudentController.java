package com.node.springboot.web;

import com.node.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController 相当于控制层上类上加@Controller + 方法上加@ResponseBody,
// 意味着当前控制层类中返回的都是json对象
public class StudentController {


    @RequestMapping("/student")
    @ResponseBody
    public Object student()
    {
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;
    }
    //该方法请求方式支持get和post
    @RequestMapping("/studentDetail")
    public Object queryStudentById(Integer id)
    {
        Student student = new Student();
        student.setId(id);
        return "studentDeail";
    }


    //@GetMapping查询操作时使用
    @GetMapping(value = "querytStudentById2")
    public Object queryStudentById2()
    {
        Student student = new Student();
        return "Only Get Method";
    }


    //@PostMapping通常在新增数据的时候使用-》新增
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Object insert()
    {
        return "Insert Success";
    }


}
