package com.training.MysqolService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.MysqolService.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String>{
	
}
