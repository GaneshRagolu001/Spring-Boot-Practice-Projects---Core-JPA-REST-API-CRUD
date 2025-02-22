package com.ganesh.demo.CoachEntity;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("This Constructor is from: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice Goals for 1hrs";
    }
}
