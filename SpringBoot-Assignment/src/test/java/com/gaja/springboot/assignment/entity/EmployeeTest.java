package com.gaja.springboot.assignment.entity;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testGettersAndSetters() {
        // Create an instance of Employee
        Employee employee = new Employee();

        // Set values using setters
        employee.setId(1);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmail("john.doe@example.com");

        // Verify values using getters
        assertEquals(1, employee.getId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    void testConstructorWithId() {
        // Create an instance of Employee using the constructor with id parameter
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");

        // Verify values using getters
        assertEquals(1, employee.getId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    void testConstructorWithoutId() {
        // Create an instance of Employee using the constructor without id parameter
        Employee employee = new Employee("John", "Doe", "john.doe@example.com");

        // Verify values using getters
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    void testToString() {
        // Create an instance of Employee
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");

        // Verify the toString method
        assertEquals("Employee [id=1, firstName=John, lastName=Doe, email=john.doe@example.com]", employee.toString());
    }
}
