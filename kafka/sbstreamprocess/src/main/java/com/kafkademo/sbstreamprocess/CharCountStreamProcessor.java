package com.kafkademo.sbstreamprocess;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CharCountStreamProcessor {

    private static final String INPUT_TOPIC = "quickstart-events";
    private static final String OUTPUT_TOPIC = "output-topic";

    @Bean
    public KStream<String, String> kStream(StreamsBuilder builder) {

        KStream<String, String> inputStream = builder.stream(INPUT_TOPIC);

        KStream<String, String> outputStream =
                inputStream.mapValues(value -> {
                    int charCount = (value == null) ? 0 : value.length();
                    return value + " Char count = " + charCount;
                });

        outputStream.to(OUTPUT_TOPIC);

        return outputStream;
    }
}