package com.example.demo.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Data
public class Sing {

    Date date = new Date();

    @Lookup
    public Proto getProto() {
        return null;
    }
}
