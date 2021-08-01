package com.node.springboot.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.node.springboot.service.StudentService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        //调用数据持久层
        return 1250;
    }
}
