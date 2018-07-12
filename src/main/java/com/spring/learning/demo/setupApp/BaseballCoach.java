package com.spring.learning.demo.setupApp;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTrainingStuff() {
        return "Run 5 km";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
