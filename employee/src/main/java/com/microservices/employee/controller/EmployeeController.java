package com.microservices.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employee.dto.EmployeeDTO;
import com.microservices.employee.entity.Employee;
import com.microservices.employee.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PostMapping("")
	public Employee save(@RequestBody Employee emp)
	{
		return service.save(emp);
	}

}
