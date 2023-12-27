package com.microservices.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.employee.dto.EmployeeDTO;
import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public List<Employee> getAllEmployees()
	{
		List<Employee> emp = repo.findAll();
		return emp;
	}
	
	public Employee save(Employee emp)
	{
		emp=repo.save(emp);
		return emp;
	}

}
