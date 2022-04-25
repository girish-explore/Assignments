package com.virtusa;

import com.jpmc.util.Employee;

public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Employee e1=new Employee();
        e1.setId(69846);
        e1.setName("kalyan");
        e1.setAge(26);
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getAge());
    }
    
}
