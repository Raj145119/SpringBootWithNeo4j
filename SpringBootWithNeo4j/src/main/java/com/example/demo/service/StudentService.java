package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudent(){
		return studentRepository.getAllStudent();
	}

	public Student updateStudent(Student student) {
		Long id=student.getSid();
		Student st=studentRepository.getByStudentId(id);
		if(st!=null) {
			if(student.getName()!=null)
				st.setName(student.getName());
			if(student.getAge()!=0)
				st.setAge(student.getAge());
			if(student.getAddress()!=null)
				st.setAddress(student.getAddress());
			
			return studentRepository.save(st);
		}
		else {
			return null;
		}
	}
	
	public void deleteStudent(Long id){
			studentRepository.deleteStudentById(id);
	}

	
}
