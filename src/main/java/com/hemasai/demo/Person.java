package com.hemasai.demo;

//Spring Bean as it is managed by the Spring
public class Person {
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
