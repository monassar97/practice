package com.training.MysqolService.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.training.MysqolService.model.Student;

public class StudentRepoImplementation implements StudentRepoDAO {
	private final StudentRepo repo;

	public StudentRepoImplementation(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Optional<Student> getStudentById(String id) {
		return repo.findById(id);
	}

	@Override
	public List<Student> getAll() {

		return repo.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public boolean deleteStudentById(String id) {
		if (!repo.existsById(id))
			return false;
		else {
			repo.deleteById(id);
			return true;
		}
	}

	@Override
	public Student createStudent(Student student) {

		repo.save(student);
		return student;
	}

	@Override
	public boolean updateStduent(Student student) {
		if (!repo.existsById(student.getId()))
			return false;
		else {
			repo.save(student);
			return true;
		}
	}

}
