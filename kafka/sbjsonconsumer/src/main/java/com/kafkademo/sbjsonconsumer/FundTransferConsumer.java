package com.kafkademo.sbjsonconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class FundTransferConsumer {

    @KafkaListener(
        topics = "fund-transfer-events",
        groupId = "fund-transfer-consumer-group"
    )
    public void consume(
            @Header(KafkaHeaders.RECEIVED_KEY) String key,
            FundTransferEvent value,
            @Header(KafkaHeaders.OFFSET) long offset
        //  @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition
        ) {

        System.out.println("----- Kafka Message Received -----");
        System.out.println("Key        : " + key);
//      System.out.println("Partition  : " + partition);
        System.out.println("Offset     : " + offset);
        System.out.println("Value      : " + value);
        System.out.println("---------------------------------");
    }
}

