package com.ganesh.demo.CoachEntity;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("This Constructor is from: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice Goal keeping for 2hrs";
    }
}
