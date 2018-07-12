package com.example.demo.test;

import lombok.Data;
import lombok.ToString;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;

@Data
public class Proto {

    Date date = new Date();

    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroyed");
    }


}
