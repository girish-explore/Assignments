package com.company.springhw.beans;

public class MyChildBean {
    private int age;
    private MyUtilBean utils;
    
    public MyChildBean() {
        System.out.println(".............In ChildBean constructor............");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public MyUtilBean getUtils() {
        return utils;
    }
    public void setUtils(MyUtilBean utils) {
        this.utils = utils;
    }

    @Override
    public String toString() {
        return "MyChildBean [age=" + age + ", utils=" + utils + "]";
    }

    
    

    
}
