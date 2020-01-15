package com.training.MysqolService.adapter.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.MysqolService.model.Student;
import com.training.MysqolService.repository.StudentRepoDAO;

@RestController
@RequestMapping("students")
public class StudentController {
	private final StudentRepoDAO repo;

	public StudentController(StudentRepoDAO repo) {
		super();
		this.repo = repo;
	}

	@GetMapping("/{id}")
	public Optional<Student> getStudent(@PathVariable("id") String id) {
		return repo.getStudentById(id);
	}

	@GetMapping
	public List<Student> getAll() {
		return repo.getAll();
	}

	@DeleteMapping("/{id}")
	public boolean deleteuser(@PathVariable("id") String id) {
		return repo.deleteStudentById(id);
	}

	@PutMapping
	public boolean updateUser(@RequestBody Student student) {
		return repo.updateStduent(student);
	}

	@PostMapping
	public Student addUser(@RequestBody Student student) {
		return repo.createStudent(student);
	}

}
