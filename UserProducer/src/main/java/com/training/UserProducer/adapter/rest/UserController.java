package com.training.UserProducer.adapter.rest;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.UserProducer.adapter.outbound.message.LocationSender;
import com.training.UserProducer.model.User;
import com.training.UserProducer.repository.Implementation;

@RestController
@RequestMapping("/user")
@EnableBinding(LocationSender.class)
public class UserController {
	private final Implementation repository;
	private final LocationSender sender;

	public UserController(Implementation repository, LocationSender sender) {
		super();
		this.repository = repository;
		this.sender = sender;
	}

	@PostMapping
	public User RegisterUser(@RequestBody User user) {
		Message<String> msg = MessageBuilder.withPayload(user.getLocation()).build();
		sender.output().send(msg);

		repository.register(user);
		return user;
	}
	// @GetMapping("/user/{id}")

}
