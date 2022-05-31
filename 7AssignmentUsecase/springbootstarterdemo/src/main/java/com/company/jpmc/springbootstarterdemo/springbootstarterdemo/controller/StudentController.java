package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.controller;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;
import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.service.StudentServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {


    @Autowired
    private StudentServiceInterface studentServiceInterface;

    
}
