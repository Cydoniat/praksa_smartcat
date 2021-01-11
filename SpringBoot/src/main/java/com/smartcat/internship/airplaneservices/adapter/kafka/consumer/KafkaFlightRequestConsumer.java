package com.smartcat.internship.airplaneservices.adapter.kafka.consumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;
import java.util.Properties;

public class KafkaFlightRequestConsumer extends KafkaConsumer<String, Object> {



    public KafkaFlightRequestConsumer(Map<String, Object> configs) {
        super(configs);
    }

    public KafkaFlightRequestConsumer(Map<String, Object> configs, Deserializer<String> keyDeserializer, Deserializer<Object> valueDeserializer) {
        super(configs, keyDeserializer, valueDeserializer);
    }

    public KafkaFlightRequestConsumer(Properties properties) {
        super(properties);
    }

    public KafkaFlightRequestConsumer(Properties properties, Deserializer<String> keyDeserializer, Deserializer<Object> valueDeserializer) {
        super(properties, keyDeserializer, valueDeserializer);
    }
}
