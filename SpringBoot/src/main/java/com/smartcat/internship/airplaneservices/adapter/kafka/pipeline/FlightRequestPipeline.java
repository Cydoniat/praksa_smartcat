package com.smartcat.internship.airplaneservices.adapter.kafka.pipeline;

import com.smartcat.internship.airplaneservices.adapter.kafka.consumer.KafkaFlightRequestConsumer;
import com.smartcat.internship.airplaneservices.adapter.kafka.producer.KafkaFlightResponseProducer;
import com.smartcat.internship.airplaneservices.domain.Event;
import com.smartcat.internship.airplaneservices.domain.PipelineProcessor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.KafkaException;
import org.apache.kafka.common.errors.AuthorizationException;
import org.apache.kafka.common.errors.OutOfOrderSequenceException;
import org.apache.kafka.common.errors.ProducerFencedException;

import java.time.Duration;
import java.util.List;

public class FlightRequestPipeline {

    private KafkaFlightRequestConsumer consumer;
    private KafkaFlightResponseProducer producer;
    private List<PipelineProcessor> processors;

    public FlightRequestPipeline(KafkaFlightRequestConsumer consumer, KafkaFlightResponseProducer producer, List<PipelineProcessor> processors) {
        this.consumer = consumer;
        this.producer = producer;
        this.processors = processors;
    }

    void processNext() {
        ConsumerRecords<String, Object> records = consumer.poll(Duration.ofMillis(100));
        for (ConsumerRecord<String, Object> record : records) {
            if (record != null) {
                Event e = new Event(record.key(), record.value(), record.topic(), record.partition());
                processors.forEach(pipelineProcessor -> {
                    if (pipelineProcessor.accepts(e)) {
                        //Sto bi KafkaFlightReqProd ovde publishovao?
                        //Vise mi smisla ima da bude KafkaFlightApprovalProducer jer on kaze
                        //da li avion moze da poleti ili ne
                        //Sta se ovde desava?
                        try {
                            producer.send(new ProducerRecord(e.getTopic(), e.getPartition(), e.getKey(), e.getValue()));
                            producer.commitTransaction();
                        } catch (ProducerFencedException | OutOfOrderSequenceException | AuthorizationException ex) {
                            producer.close();
                        } catch (KafkaException ex) {
                            producer.abortTransaction();
                        }
                    }
                });
            }
        }
        //Gde na kraju zatvaramo producera?
    }
}
