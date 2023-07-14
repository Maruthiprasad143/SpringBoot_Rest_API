package com.Lucky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lucky.model.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String>{

}
