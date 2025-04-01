package com.itq.medcard.business;

import com.itq.medcard.dto.PatientRequest;
import com.itq.medcard.dto.PatientResponse;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class PatientService {

    public PatientResponse registerPatient(PatientRequest request) {
        PatientResponse response = new PatientResponse();

        if (request.getFullName() == null || request.getFullName().trim().isEmpty()) {
            response.setStatusCode(400);
            response.setMessage("Nombre completo es requerido");
            return response;
        }

        if (request.getAge() <= 0) {
            response.setStatusCode(400);
            response.setMessage("Edad debe ser mayor que cero");
            return response;
        }

        String recordNumber = "MC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        response.setStatusCode(201);
        response.setMessage("Paciente registrado exitosamente");
        response.setMedicalRecordNumber(recordNumber);

        return response;
    }
}