package com.example.demo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.example.demo.model.Student;

public interface StudentRepository extends Neo4jRepository<Student, Long> {

	@Query("match(n:Student) return n")
	public List<Student> getAllStudent();
	
	@Query("match(n:Student {sid:$id1}) delete n")
	public void deleteStudentById(Long id1);

	@Query("match(n:Student {sid:$id}) return n")
	public Student getByStudentId(Long id);
}
