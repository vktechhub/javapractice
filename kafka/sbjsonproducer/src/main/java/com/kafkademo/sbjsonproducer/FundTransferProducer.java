package com.kafkademo.sbjsonproducer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FundTransferProducer {

    private static final String TOPIC = "fund-transfer-events";

    private final KafkaTemplate<String, FundTransferEvent> kafkaTemplate;

    public FundTransferProducer(KafkaTemplate<String, FundTransferEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(FundTransferEvent event) {
        kafkaTemplate.send(
                TOPIC,
                event.getTransactionId(), // key
                event                        // value (JSON)
        );
    }
}