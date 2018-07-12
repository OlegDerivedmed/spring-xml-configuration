package com.example.demo.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class Service1 {

    @Autowired
    private Proto proto;


}
