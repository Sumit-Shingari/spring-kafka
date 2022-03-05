package com.sumit.shingari.springkafkadocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

	@Autowired
	private KafkaProducer producer;
	
	@PostMapping("/publish")
	public void writeMessageToTopic(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}
}
