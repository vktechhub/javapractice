package com.kafkademo.javasimpleproducer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.Future;

/**
 * Hello world!
 */
public class App {

    private static final String TOPIC = "quickstart-events";
	public static void main(String[] args) throws Exception {
		System.out.println("Simple Kafka Producer Application Started...");

        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // Reliability (optional but good practice)
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 3);

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        Random random = new Random();

        System.out.println("Kafka producer started...");

        try {
            for (int i = 1; i <= 20; i++) {

                String key = "key-" + (random.nextInt(10000) + 100);

                String value = String.format(
                        "txnId=%d | key=%s | time=%s | This is a test message ",
                        i,
                        key,
                        LocalDateTime.now()
                );

                ProducerRecord<String, String> record =
                        new ProducerRecord<>(TOPIC, key, value);

                Future<RecordMetadata> future = producer.send(record);

                // RecordMetadata metadata = future.get(); // synchronous send (optional)

                // System.out.printf(
                //         "Produced record: key=%s value=%s partition=%d offset=%d%n",
                //         key,
                //         value,
                //         metadata.partition(),
                //         metadata.offset()
                // );

                // Sleep after each record
                Thread.sleep(2000); // 2 seconds
            }
        } finally {
            producer.close();
        }

		
	}

}
