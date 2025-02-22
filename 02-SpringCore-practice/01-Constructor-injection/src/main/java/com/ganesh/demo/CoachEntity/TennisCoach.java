package com.ganesh.demo.CoachEntity;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    public TennisCoach(){
        System.out.println("This Constructor is from: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice Tennis for 3hrs";
    }
}
