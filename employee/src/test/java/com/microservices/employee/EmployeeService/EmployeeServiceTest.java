package com.microservices.employee.EmployeeService;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.microservices.employee.entity.Employee;
import com.microservices.employee.repository.EmployeeRepository;
import com.microservices.employee.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {
	@InjectMocks
	private EmployeeService employeeService;
	
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	/*
	 * @Test public void testGetAllEmployees() {
	 * Mockito.when(employeeRepository.findAll()).thenReturn(List.of( ));
	 * List<Employee> result = employeeService.getAllEmployees();
	 * org.junit.jupiter.api.Assertions.assertEquals(0,result.size()); }
	 */
	
}
