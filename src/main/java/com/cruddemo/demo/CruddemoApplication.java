package com.cruddemo.demo;

import com.cruddemo.demo.dao.StudentDAO;
import com.cruddemo.demo.entity.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	//@Bean
	//public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
	//	return args -> {
	//		Student theStudent = new Student(1, "Luis", "Pérez");
	//		studentDAO.save(theStudent);
	//		System.out.println("Estudiante agregado: " + theStudent.getIdstudent());
	//	};
//	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			Student theStudent = studentDAO.findById(1);
			System.out.println("Estudiante encontrado: " + theStudent.getIdstudent());
			for (Student student : studentDAO.findAll()) {
				System.out.println(student);

			}
		};
	}
}
