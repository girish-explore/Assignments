package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.service;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;

public interface StudentServiceInterface {
    
    boolean save(Student student) throws Exception;
}
