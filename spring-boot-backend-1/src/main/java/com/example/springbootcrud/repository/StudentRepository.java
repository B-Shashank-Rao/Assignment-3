package com.example.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootcrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
