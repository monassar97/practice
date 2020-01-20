package com.training.UserConsumer.adapter.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import com.training.UserConsumer.adapter.outbound.message.LocationReciver;

@EnableBinding(LocationReciver.class)
public class LocationConsumer {
	
	@StreamListener(LocationReciver.CHANNEL_NAME)
	public void reciveMessage(String location) {
		System.out.println(location);
	}
	
}
