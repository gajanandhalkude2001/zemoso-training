package com.gaja.springboot.assignment.service;

import com.gaja.springboot.assignment.dao.EmployeeRepository;
import com.gaja.springboot.assignment.entity.Employee;
import com.gaja.springboot.assignment.entity.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Captor
    private ArgumentCaptor<Employee> employeeCaptor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindAll() {
        // Create a list of test employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "john@example.com"));
        employees.add(new Employee(2, "Jane", "Smith", "jane@example.com"));

        when(employeeRepository.findAllByOrderByLastNameAsc()).thenReturn(employees);

        List<Employee> result = employeeService.findAll();

        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getFirstName());
        assertEquals("Jane", result.get(1).getFirstName());

        verify(employeeRepository).findAllByOrderByLastNameAsc();
    }

    @Test
    void testFindById() {
        int employeeId = 1;
        Project project = new Project(1, "Project A");
        Employee employee = new Employee(employeeId, "John", "Doe", "john@example.com");
        employee.setProject(project);

        when(employeeRepository.findById(employeeId)).thenReturn(Optional.of(employee));

        Employee result = employeeService.findById(employeeId);

        assertEquals(employeeId, result.getId());
        assertEquals("John", result.getFirstName());
        assertEquals("Project A", result.getProject().getProjectName());

        verify(employeeRepository).findById(employeeId);
    }

    @Test
    void testFindById_NotFound() {
        int employeeId = 1;

        when(employeeRepository.findById(employeeId)).thenReturn(Optional.empty());

        try {
            employeeService.findById(employeeId);
        } catch (RuntimeException e) {
            assertEquals("Did not find employee id - " + employeeId, e.getMessage());
        }

        verify(employeeRepository).findById(employeeId);
    }

    @Test
    void testSave() {
        Project project = new Project(1, "Project A");
        Employee employee = new Employee(1, "John", "Doe", "john@example.com");
        employee.setProject(project);

        employeeService.save(employee);

        verify(employeeRepository).save(employeeCaptor.capture());

        Employee savedEmployee = employeeCaptor.getValue();

        assertEquals(employee.getId(), savedEmployee.getId());
        assertEquals("John", savedEmployee.getFirstName());
        assertEquals("Doe", savedEmployee.getLastName());
        assertEquals("john@example.com", savedEmployee.getEmail());
        assertEquals(project, savedEmployee.getProject());
    }

    @Test
    void testDeleteById() {
        int employeeId = 1;

        employeeService.deleteById(employeeId);
        verify(employeeRepository).deleteById(employeeId);
    }
}
