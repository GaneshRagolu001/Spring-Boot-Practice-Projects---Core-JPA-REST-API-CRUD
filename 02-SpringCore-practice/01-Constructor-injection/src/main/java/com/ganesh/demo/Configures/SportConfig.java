package com.ganesh.demo.Configures;

import com.ganesh.demo.CoachEntity.Coach;
import com.ganesh.demo.CoachEntity.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swimbro")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
