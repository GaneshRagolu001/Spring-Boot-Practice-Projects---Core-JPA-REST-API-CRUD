package com.ganeprojects.demo.Myapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose a / end ponin
//    @GetMapping("/")
//    public String sayHello(){
//        return "Hello World!";
//    }

    @Value("${coach.name}")
    private String CoachName;

    @Value("${team.name}")
    private String TeamName;

    @GetMapping("/")
    public String Names(){
        return CoachName + " " + TeamName;
    }

}
