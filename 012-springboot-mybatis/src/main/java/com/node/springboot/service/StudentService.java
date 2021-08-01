package com.node.springboot.service;

import com.node.springboot.model.Student;

public interface StudentService {
    Student queryStudentById(Integer id);
}
