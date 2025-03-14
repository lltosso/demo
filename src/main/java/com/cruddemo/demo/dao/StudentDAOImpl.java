package com.cruddemo.demo.dao;

import com.cruddemo.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }

    @Override
    public Student findById(int idstudent) {
        return this.entityManager.find(Student.class, idstudent);
    }

    @Override
    public List<Student> findAll(){
        TypedQuery<Student> theQuery;
        theQuery = entityManager.createQuery("FROM Student", Student.class);
        return theQuery.getResultList();
    }



    @Override
    public List<Student> findByLastName(String last_Name) {
        TypedQuery<Student> theQuery;
        theQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:theLastName", Student.class);
        theQuery.setParameter("theLastName", last_Name);

        return theQuery.getResultList();
    }
}




