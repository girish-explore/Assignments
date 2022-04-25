package com.company.springhw.beans;

public class MyBean {

    public MyBean(){
        System.out.println("====> In Constructor ");
    }
    private String message;
    private MyChildBean child;
    private MyUtilBean utils;
    
    public String getMessage() {
        return message.concat("to spring framework");
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public MyChildBean getChild() {
        return child;
    }
    public void setChild(MyChildBean child) {
        this.child = child;
    }
    
    public MyUtilBean getUtils() {
        return utils;
    }
    public void setUtils(MyUtilBean utils) {
        this.utils = utils;
    }
    
    @Override
    public String toString() {
        return "MyBean [child=" + child + ", message=" + message + ", utils=" + utils + "]";
    }
    //LifeCycles
    public void init(){
        System.out.println("......INIT");
    }
    public void destroy(){
        System.out.println("......DESTROY");
    }
    
}
