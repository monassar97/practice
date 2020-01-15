package com.training.MysqolService.repository;

import java.util.List;
import java.util.Optional;

import com.training.MysqolService.model.Student;

public interface StudentRepoDAO {
	public Optional<Student> getStudentById(String id);
	public List<Student> getAll();
	public boolean deleteStudentById(String id);
	public Student createStudent(Student student);
	public boolean updateStduent(Student student);
}
