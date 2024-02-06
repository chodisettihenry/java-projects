package com.employee.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	 @Autowired
	    private EmployeeService employeeService;

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
	        return employeeService.getEmployeeById(id);
	    }

	    @PostMapping
	    public Employee saveEmployee(@RequestBody Employee employee) {
	        return employeeService.saveEmployee(employee);
	    }

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	        // Assuming the employee exists; you might want to add validation
	        return employeeService.saveEmployee(employee);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	    }
	
	

}
