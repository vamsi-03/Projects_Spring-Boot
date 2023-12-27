package com.microservices.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.employee.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	//List<Employee> findByAgeGreaterThen(int age);
	

}