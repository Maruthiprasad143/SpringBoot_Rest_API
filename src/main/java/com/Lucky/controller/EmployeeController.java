package com.Lucky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lucky.model.EmployeeEntity;
import com.Lucky.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// read specific recored
	@GetMapping("{employeeId}")
	public EmployeeEntity getEmployeeDetails(@PathVariable String employeeId) {
		return employeeService.getEmployeeDetailId(employeeId);
	}

	// Get All specific recored
	@GetMapping
	public List<EmployeeEntity> getAllEmployeeDetails() {
		return employeeService.getAllEmployeeDetails();
	}

	@PostMapping
	public String createEmployeeDetails(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.createEmployeeDetails(employeeEntity);
		return "Employee Create Successfully";
	}

	@PutMapping
	public String updateEmployeeDetails(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.updateEmployeeDetails(employeeEntity);
		return "Employee Updated Successfully";
	}

	@DeleteMapping("{employeeId}")
	public String deleteEmployeeDetails(@PathVariable("employeeId") String employeeId) {
		employeeService.DeleteEmployeeDetails(employeeId);
		return "Employee Delete Successfully";
	}
}
