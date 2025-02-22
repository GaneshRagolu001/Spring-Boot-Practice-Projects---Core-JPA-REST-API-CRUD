package com.ganesh.demo.CoachEntity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("This Constructor is from: " + getClass().getSimpleName());
    }



    @Override
    public String getWorkout() {
        return "Please Practice bowling 1hour!!";
    }


}
