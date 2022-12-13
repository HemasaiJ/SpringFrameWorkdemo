package com.hemasai.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFramework {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person").toString());

        //get all the beans present in IOC
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
