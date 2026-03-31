package com.studentAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentAPI.entity.Student;
import com.studentAPI.exception.StudentNotFoundException;
import com.studentAPI.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAllStudents()
	{
		return repo.findAll();
	}
	
	public Student getStudentById(Long id)
	{
		return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("STudent not found with ID "+id));
	}
	
	public Student saveStudent(Student stu)
	{
		return repo.save(stu);
	}
	
	public void deleteStudentById(Long id)
	{
		Student stu = repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id "+id));
		repo.delete(stu);
	}
	
}
