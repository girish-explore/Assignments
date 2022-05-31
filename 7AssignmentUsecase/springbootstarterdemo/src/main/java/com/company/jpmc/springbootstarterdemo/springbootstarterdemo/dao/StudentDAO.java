package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dao;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO implements StudentOperationsInterface{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public boolean save(Student student) throws Exception {
        
        studentRepository.save(student);
        return false;
    }

    
}
