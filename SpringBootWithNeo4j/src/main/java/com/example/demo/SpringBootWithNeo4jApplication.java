package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = "com.example.demo.repository")
public class SpringBootWithNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithNeo4jApplication.class, args);
	}

}
