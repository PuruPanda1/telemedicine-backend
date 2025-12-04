//package com.example.demo.client;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.Map;
//
//@FeignClient(name = "NOTIFICATION-SERVICE", url = "${notification.service.url:http://localhost:8085}")
//public interface NotificationClient {
//
//    @PostMapping("/notify/appointment-status")
//    void sendAppointmentStatus(@RequestBody Map<String, Object> data);
//}
