package com.spring.learning.demo.setupApp;

public class FootballCoach implements Coach {

    private String email;
    private String team;
    private FortuneService fortuneService;

    public FootballCoach() {
        System.out.println("Creating coach");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setting fortune");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTrainingStuff() {
        return "Football trainer stuff";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void initMethod(){
        System.out.println("in the Init method");
    }

    public void destroyMethod(){
        System.out.println("From destroy");
    }
}
