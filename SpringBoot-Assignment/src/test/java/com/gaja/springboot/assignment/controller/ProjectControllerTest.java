package com.gaja.springboot.assignment.controller;

import com.gaja.springboot.assignment.entity.Employee;
import com.gaja.springboot.assignment.entity.Project;
import com.gaja.springboot.assignment.service.EmployeeService;
import com.gaja.springboot.assignment.service.ProjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProjectControllerTest {

    @Mock
    private ProjectService projectService;

    @Mock
    private EmployeeService employeeService;

    @Mock
    private Model model;

    @InjectMocks
    private ProjectController projectController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testProjectsList() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "Project 1"));
        projects.add(new Project(2, "Project 2"));

        when(projectService.findAll()).thenReturn(projects);

        String viewName = projectController.projectsList(model);

        assertEquals("projects/list-projects", viewName);
        verify(model, times(1)).addAttribute("projects", projects);
    }

    @Test
    void testShowFormForAdd() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com"));

        when(employeeService.findAll()).thenReturn(employees);

        String viewName = projectController.showFormForAdd(model);

        assertEquals("projects/project-form", viewName);
        verify(model, times(1)).addAttribute(eq("project"), any(Project.class));
        verify(model, times(1)).addAttribute("employees", employees);
    }


    @Test
    void testShowFormForUpdate() {
        int projectId = 1;
        Project project = new Project(projectId, "Project 1");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Don", "john@example.com"));


        when(projectService.findById(projectId)).thenReturn(project);
        when(employeeService.findAll()).thenReturn(employees);

        String viewName = projectController.showFormForUpdate(projectId, model);

        assertEquals("projects/project-form", viewName);
        verify(model, times(1)).addAttribute("project", project);
        verify(model, times(1)).addAttribute("employees", employees);
    }

    @Test
    void testSave() {
        Project project = new Project(1, "Project 1");

        String viewName = projectController.save(project);

        assertEquals("redirect:/projects/list", viewName);
        verify(projectService, times(1)).save(project);
    }

    @Test
    void testDelete() {
        int projectId = 1;

        String viewName = projectController.delete(projectId);

        assertEquals("redirect:/projects/list", viewName);
        verify(projectService, times(1)).deleteById(projectId);
    }
}