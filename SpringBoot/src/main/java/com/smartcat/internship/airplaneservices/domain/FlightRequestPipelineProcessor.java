package com.smartcat.internship.airplaneservices.domain;

import avro.schemas.v1.FlightRequest;

public class FlightRequestPipelineProcessor implements PipelineProcessor<String, FlightRequest> {

    @Override
    public Event process(Event event) {
        //Check if the flight could be initiated - za ovo moram da znam koliko trenutno ima
        //letova a taj podatak nismo nigde jos pominjali
        //Ovde kao uzimamo value, sto bi trebalo da bude FlightReq-oliko
        Object value = event.getValue();
        //Izvucemo lat12, lon12 i preko distance = DistanceCal.distance(lat1, lon1, lat2, lon2);

        //Sto ne bismo vracali samo FlightResponse?
        return null;
    }

    @Override
    public boolean accepts(Event event) {
        return event.getValue().getClass().equals(FlightRequest.class);
    }
}
