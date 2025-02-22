package com.CrudPractice.CRUD.Controller;

import com.CrudPractice.CRUD.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping
    public void postStudent(@RequestBody Student student){

    }
    @GetMapping
    public void getStudent(){

    }
}
