package com.example.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Conf {

    @Bean
    @Scope("prototype")
    public Proto getProto(){
        return new Proto();
    }
}
