package com.node.springboot.service;


import com.node.springboot.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    int updateStudentById(Student student);
}
