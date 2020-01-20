package com.training.UserProducer.repository;

import java.util.Optional;

import com.training.UserProducer.model.User;

public interface UserDAO {
	public User register(User user);

	public User update(User user);

	public  Optional<User> getOne(String id);

	public void delete(String id);
}
