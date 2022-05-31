package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.controller;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;
import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.service.StudentServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {


    @Autowired
    private StudentServiceInterface studentServiceInterface;

    @RequestMapping(value = "/savestudent")
    public String save(Student student){
        student.setStudent_name("Suersh");
        student.setStudent_age(26);
        student.setStudent_email("suresh26@gmail.com");
        
        try {
            studentServiceInterface.save(student);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return null;
    }
    
}
