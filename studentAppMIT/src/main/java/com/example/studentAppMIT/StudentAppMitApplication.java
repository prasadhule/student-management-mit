package com.example.studentAppMIT;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentAppMIT.entity.Student;
import com.example.studentAppMIT.repository.StudentRepository;

@SpringBootApplication
public class StudentAppMitApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentAppMitApplication .class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 
		
	}

}