package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	// Add new  Student
	@PostMapping("/addStudent")
	private Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	// Get All Student Details
	@GetMapping("/allStudent")
	private List<Student> getAllStudent() {
		
		List<Student> obj= 	studentService.getAllStudent();
		return obj;
	}
	
	//Update Student Details
	@PutMapping("/updateStudent")
	private Student updateStudent(@RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	
	// Delete the Student by studentID
	@DeleteMapping("/deleteStudent")
	private void deleteStudent(@RequestParam(value="id",required= false) Long id) {
		
		System.out.println(id);
		studentService.deleteStudent(id);
	
	}
}
