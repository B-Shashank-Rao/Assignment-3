package com.example.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.entity.Student;
import com.example.springbootcrud.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	@GetMapping(path = "/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentservice.getStudent(id);
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student st) {
		return studentservice.save(st);
	}
	@PutMapping
	public Student updateStudent(@RequestBody Student st) {
		return studentservice.update(st);
	}
	@DeleteMapping
	public Student deleteEmployee(@RequestBody Student st) {
		return studentservice.delete(st.getId());
	}

}
