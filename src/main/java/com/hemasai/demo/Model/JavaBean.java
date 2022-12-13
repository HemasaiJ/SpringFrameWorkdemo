package com.hemasai.demo.Model;

//Example of javaBean
public class JavaBean {
    //rules
    // 1- It should have a public no args constructor
    // 2- should have getters and setters
    // 3- should implement serializable
    private String name;

    private String age;

    public JavaBean(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
