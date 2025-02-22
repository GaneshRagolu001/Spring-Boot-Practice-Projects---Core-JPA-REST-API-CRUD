package com.Crud.Cruddata.DAO;

import com.Crud.Cruddata.Entity.Student;

import java.util.List;

public interface StudentDAO {

    public void save(Student student);

    public Student findbyid(int id);

    public List<Student> findAll();

    public List<Student> findByLastName(String lastname);

    public Student updateStudent(Student student);

    public void DeleteByid(int id);

    public int DeleteAll();
}
