package com.itq.medcard.service;

import com.itq.medcard.business.PatientService;
import com.itq.medcard.dto.PatientRequest;
import com.itq.medcard.dto.PatientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PatientEndpoint {

    private static final String NAMESPACE_URI = "http://com.itq/medCard";

    private final PatientService patientService;

    @Autowired
    public PatientEndpoint(PatientService patientService) {
        this.patientService = patientService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PatientRequest")
    @ResponsePayload
    public PatientResponse registerPatient(@RequestPayload PatientRequest request) {
        return patientService.registerPatient(request);
    }
}