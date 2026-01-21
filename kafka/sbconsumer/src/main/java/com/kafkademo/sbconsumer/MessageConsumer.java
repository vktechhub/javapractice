package com.kafkademo.sbconsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(
    topics = "quickstart-events",
    groupId = "spring-text-consumer-group"
)
    public void consume(ConsumerRecord<String, String> record) {

        System.out.printf(
                "[KafkaTime=%s] message=%s partition=%d offset=%d%n",
                record.timestamp(),
                record.value(),
                record.partition(),
                record.offset()
        );
    }
}