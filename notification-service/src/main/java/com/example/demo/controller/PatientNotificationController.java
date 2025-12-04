package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ConsultationStatusNotificationRequest;
import com.example.demo.service.EmailService;
import com.example.demo.service.EmailTemplates;

@RestController
@RequestMapping("/notifications/patient")
public class PatientNotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/consultation-status")
    public String sendConsultationStatus(@RequestBody ConsultationStatusNotificationRequest req) {

        String email = req.getPatientEmailId();
        Long consultationId = req.getConsultationId();
        String status = req.getStatus();

        String subject = "Consultation " + status;

        // Select template based on status
        String html = "";

        if(status.equalsIgnoreCase("Accepted")){
            html = EmailTemplates.patientAcceptedTemplate(consultationId);
        }else if(status.equalsIgnoreCase("Rejected")){
            html = EmailTemplates.patientRejectedTemplate(consultationId);
        }else{
            html = EmailTemplates.patientCompletedTemplate(consultationId);
        }

        emailService.sendHtmlEmail(email, subject, html);

        return "Patient notification sent.";
    }

}

