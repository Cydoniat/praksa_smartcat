package com.smartcat.internship.airplaneservices.domain;

import com.smartcat.internship.airplaneservices.adapter.kafka.consumer.configuration.KafkaFlightApprovalRequestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirplaneService {

    private final KafkaFlightApprovalRequestConfiguration configuration;

    @Autowired
    public AirplaneService(final KafkaFlightApprovalRequestConfiguration configuration)
    {
        this.configuration = configuration;
    }
    //TODO: add an implementation
    public boolean sendFlightRequest() {
        return false;
    }
}
