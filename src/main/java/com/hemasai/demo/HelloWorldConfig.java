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
        return new Person("hemasai", 24);
    }
}
