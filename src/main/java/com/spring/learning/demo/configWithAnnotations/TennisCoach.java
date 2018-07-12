package com.spring.learning.demo.configWithAnnotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String doCoach() {
        return "Hello from doCoach";
    }
}
