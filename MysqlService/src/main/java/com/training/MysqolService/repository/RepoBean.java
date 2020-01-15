package com.training.MysqolService.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoBean {

	@Bean
	public StudentRepoDAO studentRepoDao(StudentRepo repoDAO) {
		return new StudentRepoImplementation(repoDAO);
	}
}
