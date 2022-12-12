package com.hemasai.demo;

public class Address {
    private String city;
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    Address(String city, String street){
        this.city = city;
        this.street = street;
    }
}
