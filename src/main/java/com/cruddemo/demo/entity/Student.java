package com.cruddemo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idstudent;
    @Column(name="first_name")
    private String first_Name;
    @Column(name = "last_name")
    private String last_name;

    public Student() {
    }

    public Student(int id, String first_Name, String last_name) {
        this.idstudent = idstudent;
        this.first_Name = first_Name;
        this.last_name = last_name;
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idstudent=" + idstudent +
                ", first_Name='" + first_Name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
