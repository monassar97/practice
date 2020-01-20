package com.training.UserProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.training.UserProducer.adapter.outbound.message.LocationSender;

@SpringBootApplication
public class UserProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProducerApplication.class, args);
	}

}
