package com.employee.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
    // Additional custom queries can be added here
}