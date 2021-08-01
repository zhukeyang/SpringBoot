package com.node.springboot.service;


import com.alibaba.dubbo.config.annotation.Service;

@Service
public interface StudentService {
    Integer queryAllStudentCount();
}
