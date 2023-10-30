package com.greatlearning.employee.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employee.model.Employee;



public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
	
	    Optional<Employee> findById(int id); // Assuming 'id' is the primary key field.
	}

