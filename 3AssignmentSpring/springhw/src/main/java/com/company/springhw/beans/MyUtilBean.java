package com.company.springhw.beans;

public class MyUtilBean {
    private int salary;
    private int dept;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyUtilBean(int _salary, int _dept) {
        this.salary=_salary;
        this.dept=_dept;
        System.out.println("In Util Cons");
    }
    

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "MyUtilBean [dept=" + dept + ", salary=" + salary + "]";
    }

    
    
    

    
}
