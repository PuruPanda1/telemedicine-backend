package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DoctorConsultationAlertRequest;
import com.example.demo.service.EmailService;
import com.example.demo.service.EmailTemplates;

@RestController
@RequestMapping("/notifications/doctor")
public class DoctorNotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/new-consultation")
    public String sendDoctorAlert(@RequestBody DoctorConsultationAlertRequest req) {

        Long consultationId = req.getConsultationId();
        String email = req.getDoctorEmail();

        String subject = "ALERT! New Consultation Request";

        String html = EmailTemplates.doctorAlertTemplate(consultationId);

        emailService.sendHtmlEmail(email, subject, html);

        return "Doctor alert sent successfully!";
    }

}
