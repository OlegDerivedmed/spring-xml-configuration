package com.example.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Conf.class);
        Sing sing = (Sing) ctx.getBean("sing");
//        Service1 service1 = (Service1) ctx.getBean("service1");
        System.out.println(sing.getProto().equals(sing.getProto()));
    }
}
