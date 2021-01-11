package com.smartcat.internship.airplaneservices.domain;

public interface PipelineProcessor <K, V > {
    Event process(Event requests);
    boolean accepts (Event requests);
}