package com.kafkademo.javastreamprocessing;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;

import java.util.Properties;

public class App {

    public static void main(String[] args) throws Exception {
		System.out.println("Kafka Stream processing Application Started...");

        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "charcount-stream-app");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        StreamsBuilder builder = new StreamsBuilder();

        KStream<String, String> inputStream =
                builder.stream("simple-text-input");

        KStream<String, String> transformedStream =
                inputStream.mapValues(value -> {
                    int charCount = (value == null) ? 0 : value.length();
                    return value.toUpperCase() + " charcount = " + charCount;
                });
        
        transformedStream.foreach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

        transformedStream.to("simple-text-output");
        
        

        KafkaStreams streams = new KafkaStreams(builder.build(), props);

        // Graceful shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

        System.out.println("Kafka Streams CharCount application started...");
        streams.start();        

		
	}

}
