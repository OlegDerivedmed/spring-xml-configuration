package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    @Autowired
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }
}
