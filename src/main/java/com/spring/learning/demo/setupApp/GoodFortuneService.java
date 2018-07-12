package com.spring.learning.demo.setupApp;

public class GoodFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is good day for you.";
    }
}
