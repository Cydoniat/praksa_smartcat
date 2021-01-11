package com.smartcat.internship.airplaneservices.adapter.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;
import java.util.Properties;

public class KafkaFlightRequestProducer extends KafkaProducer<String, Object> implements Producer<String, Object> {

    

    public KafkaFlightRequestProducer(Map<String, Object> configs) {
        super(configs);
    }

    public KafkaFlightRequestProducer(Map<String, Object> configs, Serializer keySerializer, Serializer valueSerializer) {
        super(configs, keySerializer, valueSerializer);
    }

    public KafkaFlightRequestProducer(Properties properties) {
        super(properties);
    }

    public KafkaFlightRequestProducer(Properties properties, Serializer keySerializer, Serializer valueSerializer) {
        super(properties, keySerializer, valueSerializer);
    }
}
