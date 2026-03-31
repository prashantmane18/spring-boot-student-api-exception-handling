package com.studentAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentAPI.entity.Student;
import com.studentAPI.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id)
	{
		return studentService.getStudentById(id);
	}
	
	@GetMapping
	public List<Student> allStudents()
	{
		return studentService.getAllStudents();
	}
	
	@PostMapping
	public Student saveStudent(@RequestBody Student stu)
	{
		return studentService.saveStudent(stu);
	}
	
	@PutMapping("/{id}")
	public Student updateStudentById(@PathVariable Long id,@RequestBody Student student)
	{
		Student stu = studentService.getStudentById(id);
		
		stu.setName(student.getName());
		stu.setEmail(student.getEmail());
		stu.setCourse(student.getCourse());
		
		return studentService.saveStudent(stu);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudentById(@PathVariable Long id)
	{
		studentService.deleteStudentById(id);
	}
	
}
