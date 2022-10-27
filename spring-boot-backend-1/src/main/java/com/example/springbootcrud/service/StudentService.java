package com.example.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrud.entity.Student;
import com.example.springbootcrud.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	public Student save(Student st) {
		return studentrepo.save(st);

	}
	public Student getStudent(int id) {
		return studentrepo.findById(id).get();
	}
	
	public Student update(Student stu) {

		Student st = studentrepo.findById(stu.getId()).get();
		st.setName(stu.getName());
		st.setAge(stu.getAge());

		return studentrepo.save(stu);
	}
	public Student delete(int id) {
		studentrepo.deleteById(id);
		Student st = new Student();
		//st.setStatus("deleted");
		return st;
	}
	public StudentRepository getStudentRepository(){
		return studentrepo;
	}
}
