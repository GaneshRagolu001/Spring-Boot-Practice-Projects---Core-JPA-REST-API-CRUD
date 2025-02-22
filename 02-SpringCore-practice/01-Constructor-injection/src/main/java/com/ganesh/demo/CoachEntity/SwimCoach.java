package com.ganesh.demo.CoachEntity;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("The constructor is from: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Do Swmming for 1hr to get good health";
    }
}
