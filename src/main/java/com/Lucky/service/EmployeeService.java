package com.Lucky.service;

import java.util.List;

import com.Lucky.model.EmployeeEntity;

public interface EmployeeService {

	// create method
	public String createEmployeeDetails(EmployeeEntity employeeEntity);

	// update method
	public String updateEmployeeDetails(EmployeeEntity employeeEntity);

	// delete method
	public String DeleteEmployeeDetails(String employeeId);

	// get by id method
	public EmployeeEntity getEmployeeDetailId(String employeeId);

	// Get All method
		public List<EmployeeEntity> getAllEmployeeDetails();
	}
