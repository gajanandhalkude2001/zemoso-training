package com.gaja.springboot.assignment.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void testGettersAndSetters() {
        // Create an instance of Project
        Project project = new Project();

        // Set values using setters
        project.setId(1);
        project.setProjectName("Project 1");

        // Verify values using getters
        assertEquals(1, project.getId());
        assertEquals("Project 1", project.getProjectName());
    }

    @Test
    void testConstructorWithIdAndName() {
        // Create an instance of Project using the constructor with id and projectName parameters
        Project project = new Project(1, "Project 1");

        // Verify values using getters
        assertEquals(1, project.getId());
        assertEquals("Project 1", project.getProjectName());
    }

    @Test
    void testToString() {
        // Create an instance of Project
        Project project = new Project(1, "Project 1");

        // Verify the toString method
        assertEquals("Project{id=1, projectName='Project 1'}", project.toString());
    }
}
