package com.training.UserProducer.adapter.outbound.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LocationSender {
	String OUTPUT_CHANNEL_NAME = "location";

	@Output(OUTPUT_CHANNEL_NAME)
	MessageChannel output();
}
