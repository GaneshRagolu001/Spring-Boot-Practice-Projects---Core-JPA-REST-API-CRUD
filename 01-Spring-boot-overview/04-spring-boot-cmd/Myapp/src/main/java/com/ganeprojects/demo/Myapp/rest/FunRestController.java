package com.ganeprojects.demo.Myapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${student.name}")
    private String StudentName;

    @Value("${student.class}")
    private String StudentClass;

    @Value("${student.rollno}")
    private String StudentRollno;

    //getting student details
    @GetMapping("/students")
    public String getStudentDetaisl(){
        return "Student name" + StudentName + "Student class " + StudentClass + "Student rollno is " + StudentRollno;
    }



    // expose a / end ponin
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/Workout")
    public String getWorkoutdone(){
        return "Run minimum 8k quicklyyyy";
    }

    @GetMapping("/Fortune")
    public String getFortune(){
        return "Is your lucky day";
    }


}
