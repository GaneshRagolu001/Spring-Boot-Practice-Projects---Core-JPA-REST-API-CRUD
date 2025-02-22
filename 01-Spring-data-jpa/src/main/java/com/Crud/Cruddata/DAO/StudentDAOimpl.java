package com.Crud.Cruddata.DAO;


import com.Crud.Cruddata.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{

    //decleration of StudentEntity Manager
    public EntityManager entityManager;

    //inject DAO to entitymanager through constructon injection
    public StudentDAOimpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findbyid(int id) {
        return entityManager.find(Student.class,id);
    }


    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName asc",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastname) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:thename",Student.class);
        theQuery.setParameter("thename",lastname);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void DeleteByid(int id) {
        Student mystud = entityManager.find(Student.class,id);
        entityManager.remove(mystud);
    }

    @Override
    @Transactional
    public int DeleteAll() {
        int numberofRows = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numberofRows;
    }


}
