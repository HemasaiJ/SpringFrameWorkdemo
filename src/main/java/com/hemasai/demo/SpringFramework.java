package com.hemasai.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFramework {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person").toString());
    }
}
