package com.training.UserConsumer.adapter.outbound.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface LocationReciver {
	String CHANNEL_NAME = "location";

	@Output(CHANNEL_NAME)
	SubscribableChannel recive();
}
