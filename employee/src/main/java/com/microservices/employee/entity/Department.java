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
@Table(name="t_department")
@Getter
@Setter

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="dept_generator")
	@SequenceGenerator(name = "dept_generator", sequenceName = "dept_id_seq", allocationSize = 1)
	@Column(name="id")
	private int id;
	
	@Column(name="dept_name")
	private String name;
}
