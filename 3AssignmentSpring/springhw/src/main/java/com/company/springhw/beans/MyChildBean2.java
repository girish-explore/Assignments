package com.company.springhw.beans;

public class MyChildBean2 {
    private int age;
    private MyUtilBean utils;
    private int type;
    
    public MyChildBean2() {
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
    

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MyChildBean [age=" + age + ", utils=" + utils + "]";
    }

    
    

    
}
