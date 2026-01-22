package com.kafkademo.javasimpleconsumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Simple Kafka Consumer Application Started...");

		Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "java-text-consumer-group");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList("simple-text-input"));

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                             .withZone(ZoneId.systemDefault());

        System.out.println("Kafka consumer started...");

        while (true) {
            ConsumerRecords<String, String> records =
                consumer.poll(java.time.Duration.ofMillis(500));

            for (ConsumerRecord<String, String> record : records) {

                String kafkaTimestamp =
                    formatter.format(Instant.ofEpochMilli(record.timestamp()));

                System.out.printf(
                    "[KafkaTime=%s] message=%s partition=%d offset=%d%n",
                    kafkaTimestamp,
                    record.value(),
                    record.partition(),
                    record.offset()
                );
            }
        }
	}

}
