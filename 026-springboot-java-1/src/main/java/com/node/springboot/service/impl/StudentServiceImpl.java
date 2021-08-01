package com.node.springboot.service.impl;

import com.node.springboot.service.StudentService;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "Say Hello";
    }
}
