package com.training.UserProducer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.UserProducer.model.User;

@Repository
public interface repoJpa extends JpaRepository<User, String> {

}
