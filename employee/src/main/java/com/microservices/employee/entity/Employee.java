package com.microservices.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="t_employee")
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="emp_generator")
	@SequenceGenerator(name = "emp_generator", sequenceName = "emp_id_seq", allocationSize = 1)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="sal")
	private int salary;
	
//	@Column(name="dept")
//	@JoinColumn(referencedColumnName = "dept_id")
//	private Department dept; 
}
