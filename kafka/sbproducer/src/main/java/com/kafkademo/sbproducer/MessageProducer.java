package com.kafkademo.sbproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MessageProducer implements CommandLineRunner {

    private static final String TOPIC = "quickstart-events";
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Random random = new Random();

    public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i <= 20; i++) {

            int randomNumber = random.nextInt(1000);

            String message = i + " number " + randomNumber + " This is test message";

            kafkaTemplate.send(TOPIC, message);

            System.out.println("Produced message: " + message);

            Thread.sleep(1000); // optional: 1 second delay
        }
    }
}