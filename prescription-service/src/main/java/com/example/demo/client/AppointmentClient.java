package com.example.demo.client;

import com.example.demo.dto.AppointmentStatusUpdateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "consulting-service")
public interface AppointmentClient {

    @PutMapping("/api/consultations/status/{id}")
    public ResponseEntity<Boolean> updateAppointmentStatus(@PathVariable("id") Long id, @RequestBody AppointmentStatusUpdateRequest request);
}
