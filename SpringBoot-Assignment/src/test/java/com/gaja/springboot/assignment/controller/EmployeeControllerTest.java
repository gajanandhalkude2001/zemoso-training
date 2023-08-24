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

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @Mock
    private ProjectService projectService;

    @Mock
    private Model model;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testListEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com"));
        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com"));

        when(employeeService.findAll()).thenReturn(employees);

        String viewName = employeeController.listEmployees(model);

        assertEquals("employees/list-employees", viewName);
        verify(model, times(1)).addAttribute("employees", employees);
    }



    @Test
    void testSaveEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        int projectId = 1;
        Project project = new Project(projectId, "Project 1");

        when(projectService.findById(projectId)).thenReturn(project);

        String viewName = employeeController.saveEmployee(employee, projectId);

        assertEquals("redirect:/employees/list", viewName);
        verify(employeeService, times(1)).save(employee);
        assertEquals(project, employee.getProject());
    }

    @Test
    void testDelete() {
        int employeeId = 1;

        String viewName = employeeController.delete(employeeId);

        assertEquals("redirect:/employees/list", viewName);
        verify(employeeService, times(1)).deleteById(employeeId);
    }
}
