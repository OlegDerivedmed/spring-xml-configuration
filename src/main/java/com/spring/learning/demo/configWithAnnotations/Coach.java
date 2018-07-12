package com.spring.learning.demo.configWithAnnotations;

public interface Coach {

    default String doCoach() {
        return "Some stuff";
    }

    static void someStaticMethod(){
        System.out.println("It is static method of interface");
    }
}
