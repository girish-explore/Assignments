package com.jpmc.util;

public class Student implements java.io.Serializable{
    private int id, age;
    private String name;
    public Student(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
