package com.gaja.springboot.assignment.dao;

import com.gaja.springboot.assignment.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer>
{

}
