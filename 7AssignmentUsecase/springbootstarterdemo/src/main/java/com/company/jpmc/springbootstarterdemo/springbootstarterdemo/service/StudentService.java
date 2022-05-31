package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.service;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dao.StudentOperationsInterface;
import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService implements StudentServiceInterface{

    @Autowired
    StudentOperationsInterface studentOperationsInterface;

    @Override
    public boolean save(Student student) throws Exception {
        
        studentOperationsInterface.save(student);
        return false;
    }
    
}
