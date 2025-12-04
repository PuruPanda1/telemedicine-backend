package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MedicalRecordRequest {

    private Long consultationId;
    @NotBlank(message = "patientId is required")
    private Long patientId;
    @NotBlank(message = "doctorId is required")
    private Long doctorId;
    private String diagnosis;

    private PrescriptionRequest prescription;

}

