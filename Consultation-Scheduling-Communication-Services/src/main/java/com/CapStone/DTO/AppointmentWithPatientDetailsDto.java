
package com.CapStone.DTO;

import com.CapStone.Entity.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentWithPatientDetailsDto {

    private Long appointmentId;
    private String reason;
    private LocalDate appointmentDate;
    private LocalTime appointmentSlot;
    private String status;
    private String priority;

    private Long doctorId;
    private Long patientId;
    private String patientName; // Extra field for patient name

    public AppointmentWithPatientDetailsDto(Appointment appointment, String patientName) {
        this.appointmentId = appointment.getAppointmentId();
        this.reason = appointment.getReason();
        this.appointmentDate = appointment.getAppointmentDate();
        this.appointmentSlot = appointment.getAppointmentSlot();
        this.status = appointment.getStatus();
        this.priority = appointment.getPriority();

        this.doctorId = appointment.getDoctorId();
        this.patientId = appointment.getPatientId();
        this.patientName = patientName;
    }
}
