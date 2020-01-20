package com.training.UserProducer.repository;


import java.util.Optional;

import org.springframework.stereotype.Component;

import com.training.UserProducer.model.User;

@Component
public class Implementation implements UserDAO {
	private final repoJpa repo;

	public Implementation(repoJpa repo) {
		super();
		this.repo = repo;
	}

	@Override
	public User register(User user) {

		return repo.save(user);
	}

	@Override
	public User update(User user) {
		return repo.save(user);
	}

	@Override
	public Optional<User> getOne(String id) {
		return repo.findById(id);
	}

	@Override
	public void delete(String id) {
		repo.deleteById(id);
	}

}
