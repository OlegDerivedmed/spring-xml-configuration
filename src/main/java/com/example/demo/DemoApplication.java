package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1.equals(i2));
    }
}
