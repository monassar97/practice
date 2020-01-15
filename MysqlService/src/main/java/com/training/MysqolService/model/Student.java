package com.training.MysqolService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

	@Id
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Max(20)
	@Column(name = "age", nullable = false)
	private int age;
	@Column(name = "email", nullable = false)
	private String email;

}
