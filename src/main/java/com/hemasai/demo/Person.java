package com.hemasai.demo;

public class Person {
    private String name;

    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", address=" + address +
                '}';
    }

    private int age;
    Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
