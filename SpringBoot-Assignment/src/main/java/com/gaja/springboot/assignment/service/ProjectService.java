package com.gaja.springboot.assignment.service;

import com.gaja.springboot.assignment.entity.Employee;
import com.gaja.springboot.assignment.entity.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> findAll();

    public Project findById(int theId);

    public void save(Project theProject);

    public void deleteById(int theId);
}
