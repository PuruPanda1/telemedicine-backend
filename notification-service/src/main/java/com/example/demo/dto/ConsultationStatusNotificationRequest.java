package com.example.demo.dto;

public class ConsultationStatusNotificationRequest {

    private Long consultationId;
    private String patientEmailId;
    private String status;

    public Long getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Long consultationId) {
        this.consultationId = consultationId;
    }

    public String getPatientEmailId() {
        return patientEmailId;
    }

    public void setPatientEmailId(String patientEmailId) {
        this.patientEmailId = patientEmailId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
