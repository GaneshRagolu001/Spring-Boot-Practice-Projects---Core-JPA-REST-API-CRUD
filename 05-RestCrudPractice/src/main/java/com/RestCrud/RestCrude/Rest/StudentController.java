package com.RestCrud.RestCrude.Rest;

import com.RestCrud.RestCrude.Entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> students;

    @PostConstruct
    public void LoadData(){
        students = new ArrayList<>();
        students.add(new Student("Ragolu","Ganesh"));
        students.add(new Student("John","wick"));
        students.add(new Student("Legend","Lion"));
    }
    @GetMapping("/students/{studentId}")
    public Student getStudentbyId(@PathVariable int studentId){
        if(studentId > students.size() || studentId < 0){
            throw new StudentNotFoundException("The student data is not found for id - " + studentId);
        }
        return students.get(studentId);
    }



    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

}
