package com.Lucky.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Lucky.model.EmployeeEntity;
import com.Lucky.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public String createEmployeeDetails(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return "success";
	}

	@Override
	public String updateEmployeeDetails(EmployeeEntity employeeEntity) {
		employeeRepository.save(employeeEntity);
		return "success";
	}

	@Override
	public String DeleteEmployeeDetails(String employeeId) {
		employeeRepository.deleteById(employeeId);
		return "Delete Success";
	}

	@Override
	public EmployeeEntity getEmployeeDetailId(String employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<EmployeeEntity> getAllEmployeeDetails() {
		return employeeRepository.findAll();
	}

}
