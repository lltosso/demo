package com.cruddemo.demo.dao;
import com.cruddemo.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(int id);
    List<Student> findAll();
    List<Student> findByLastName(String last_name);
}

