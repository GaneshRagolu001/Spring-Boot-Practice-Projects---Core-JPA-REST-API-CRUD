package com.CrudPractice.CRUD.Entity;


import jakarta.persistence.Entity;

@Entity
public class Student {
    private int StudentId;
    private String StudentName;
    private int StudentAge;
    private int StudentMarks;

    public int getId() {
        return StudentId;
    }

    public void setId(int id) {
        this.StudentId = id;
    }

    public Student(int id) {
        this.StudentId = id;
    }

    public int getMarks() {
        return StudentMarks;
    }

    public void setMarks(int marks) {
        this.StudentMarks = marks;
    }

    public int getAge() {
        return StudentAge;
    }

    public void setAge(int age) {
        this.StudentAge = age;
    }

    public String getName() {
        return StudentName;
    }

    public void setName(int StudentId,String StudentName,int StudentAge,int StudentMarks) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.StudentMarks = StudentMarks;
    }

    public Student() {
        super();
    }
}
