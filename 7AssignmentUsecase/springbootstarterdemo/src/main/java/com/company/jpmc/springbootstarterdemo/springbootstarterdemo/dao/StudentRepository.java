package com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dao;

import com.company.jpmc.springbootstarterdemo.springbootstarterdemo.dto.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
