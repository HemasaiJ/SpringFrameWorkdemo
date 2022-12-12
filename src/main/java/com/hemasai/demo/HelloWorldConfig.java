package com.hemasai.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name(){
        return "Hemasai";
    }
    @Bean
    public int age(){
        return 24;
    }
    @Bean
    public Person person(){
        return new Person("hemasai", 24, new Address("abc", "xyz"));
    }

    //bean creation using existing beans and method call
    @Bean
    public Person personMethodCall(){
        return new Person(name(), age(), address());
    }

    //Bean creation using parameters
    @Bean
    public Person personParameterCall(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean(name = "address2")
    public Address address(){
        return new Address("Srikakulam", "balaga");
    }
}
