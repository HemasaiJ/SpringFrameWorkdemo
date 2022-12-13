package com.hemasai.demo.Model;

//java pojo, any object  in java is a POJO no rules
public class JavaPojo {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "JavaPojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
