package com.gaja.springboot.assignment;

import com.gaja.springboot.assignment.dao.ProjectRepository;
import com.gaja.springboot.assignment.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}
//	@Autowired
//	private ProjectRepository projectRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Project project1 = new Project(1,"Demo");
//		projectRepository.save(project1);
//
//		Project project2 = new Project(2,"FullStack");
//		projectRepository.save(project2);
//	}
}

