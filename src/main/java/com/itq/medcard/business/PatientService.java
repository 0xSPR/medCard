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

        if (request.getAge() <= 0 || request.getAge() >= 99) {
            System.out.print(request.getAge());
            response.setStatusCode(400);
            response.setMessage("Ingrese una edad valida");
            return response;
        }

        if (request.getEmail() == null || request.getEmail().trim().isEmpty()) {
            response.setStatusCode(400);
            response.setMessage("Email completo es requerido");
            return response;
        }

        if(request.getCurp() == null || request.getCurp().trim().isEmpty()) {
            response.setStatusCode(400);
            response.setMessage("Curp completo es requerido");
            return response;
        }

        validateAddress(request.getDirection());

        String recordNumber = "MC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        response.setStatusCode(201);
        response.setMessage("Paciente registrado exitosamente");
        response.setMedicalRecordNumber(recordNumber);

        return response;
    }

    private void validateAddress(PatientRequest.Direction direction) {
        if (direction == null) {
            throw new IllegalArgumentException("Direccion invalido");
        }
        if (!direction.getZipCode().matches("[0-9]{5}")) {
            throw new IllegalArgumentException("Zip invalido");
        }
    }
    private String buildFullAddress(PatientRequest.Direction direction) {
        StringBuilder sb = new StringBuilder();
        sb.append(direction.getStreet())
                .append(" ")
                .append(direction.getOuterNumber());

        if (direction.getInteriorNumber() != null && !direction.getInteriorNumber().isEmpty()) {
            sb.append(" Int. ").append(direction.getInteriorNumber());
        }

        sb.append(", ")
                .append(direction.getCologne())
                .append(", ")
                .append(direction.getZipCode())
                .append(", ")
                .append(direction.getCity())
                .append(", ")
                .append(direction.getState());

        return sb.toString();
    }

    // Método para normalizar direcciones
    public PatientRequest.Direction standardizeAddress(PatientRequest.Direction direction) {
        if (direction == null) return null;

        PatientRequest.Direction standardized = new PatientRequest.Direction();
        standardized.setStreet(direction.getStreet().trim().toUpperCase());
        standardized.setOuterNumber(direction.getOuterNumber().trim());

        if (direction.getInteriorNumber() != null) {
            standardized.setInteriorNumber(direction.getInteriorNumber().trim());
        }

        standardized.setCologne(direction.getCologne().trim().toUpperCase());
        standardized.setZipCode(direction.getZipCode().trim());
        standardized.setCity(direction.getCity().trim().toUpperCase());
        standardized.setState(direction.getState().trim().toUpperCase());

        return standardized;
    }
}