package com.smartcat.internship.airplaneservices.adapter.kafka.consumer.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Properties;

//The prefix allows us to locate the right properties in the application.yaml file
@Component
@ConfigurationProperties(prefix="kafka-flight-app-req")
public class KafkaFlightApprovalRequestConfiguration {

    private List<String> topics;
    private Properties properties;

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
