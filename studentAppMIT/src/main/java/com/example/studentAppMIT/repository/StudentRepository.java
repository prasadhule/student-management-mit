package com.example.studentAppMIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentAppMIT.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}