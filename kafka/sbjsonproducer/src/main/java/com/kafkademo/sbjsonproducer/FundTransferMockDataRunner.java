package com.kafkademo.sbjsonproducer;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FundTransferMockDataRunner implements CommandLineRunner {

    private final FundTransferProducer producer;

    public FundTransferMockDataRunner(FundTransferProducer producer) {
        this.producer = producer;
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i <= 10; i++) {

            FundTransferEvent event = new FundTransferEvent();
            event.setTransactionId("TXN-" + String.format("%05d", i));
            event.setFromAccount("ACC-" + (10000 + i));
            event.setToAccount("ACC-" + (20000 + i));
            event.setAmount(BigDecimal.valueOf(1000 + (i * 250)));
            event.setCurrency("INR");
            event.setStatus("INITIATED");
            event.setTimestamp(Instant.now());

            producer.publish(event);

            Thread.sleep(500); // simulate real transaction gaps
        }
    }
}
