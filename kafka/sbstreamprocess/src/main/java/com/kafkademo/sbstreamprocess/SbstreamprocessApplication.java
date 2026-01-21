package com.kafkademo.sbstreamprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication
@EnableKafkaStreams // This is required to create the StreamsBuilder bean
public class SbstreamprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbstreamprocessApplication.class, args);
	}

}
