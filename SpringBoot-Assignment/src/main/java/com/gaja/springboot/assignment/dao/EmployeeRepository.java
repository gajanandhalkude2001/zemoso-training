package com.gaja.springboot.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaja.springboot.assignment.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   public List<Employee> findAllByOrderByLastNameAsc();

    // that's it ... no need to write any code LOL!

}