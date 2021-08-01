package com.node.springboot.service.impl;

import com.node.springboot.mapper.StudentMapper;
import com.node.springboot.model.Student;
import com.node.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
    private StudentMapper studentMapper;


   @Transactional
    @Override
    public int updateStudentById(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);


        return i;
    }
}
