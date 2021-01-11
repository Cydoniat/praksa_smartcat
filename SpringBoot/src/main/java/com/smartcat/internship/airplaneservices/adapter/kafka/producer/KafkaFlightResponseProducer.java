package com.smartcat.internship.airplaneservices.adapter.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;
import java.util.Properties;

public class KafkaFlightResponseProducer extends KafkaProducer<String, Object> {


    public KafkaFlightResponseProducer(Map<String, Object> configs) {
        super(configs);
    }

    public KafkaFlightResponseProducer(Map<String, Object> configs, Serializer<String> keySerializer, Serializer<Object> valueSerializer) {
        super(configs, keySerializer, valueSerializer);
    }

    public KafkaFlightResponseProducer(Properties properties) {
        super(properties);
    }

    public KafkaFlightResponseProducer(Properties properties, Serializer<String> keySerializer, Serializer<Object> valueSerializer) {
        super(properties, keySerializer, valueSerializer);
    }
}
