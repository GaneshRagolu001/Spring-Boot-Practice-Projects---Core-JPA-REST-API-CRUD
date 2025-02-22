package com.ganesh.demo.RestControllers;

import com.ganesh.demo.CoachEntity.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;


    @Autowired
    public CoachController(@Qualifier("swimbro") Coach myCoach){
        System.out.println("This constructor is From: " + getClass().getSimpleName());
        this.myCoach = myCoach;

    }


    @GetMapping("/getworkout")
    public String getdailyworkout(){

        return myCoach.getWorkout();
    }

}
