package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class Conf {
    @Autowired
    private EventLoggerOne loggerOne;

    @Autowired
    private EventloggerTwo loggerTwo;

    @Bean(name = "loggers")
    public List<EventLogger> getLoggers(){
        List<EventLogger> loggers = new ArrayList<>();
        loggers.add(loggerOne);
        loggers.add(loggerTwo);
        return loggers;
    }

}
