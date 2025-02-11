package com.furkanyildirim.controller.Impl;

import com.furkanyildirim.data.entity.Appointment;
import com.furkanyildirim.business.service.Impl.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment createAppointment(
            @RequestParam Long patientId,
            @RequestParam Long doctorId,
            @RequestParam LocalDateTime appointmentDate) {
        return appointmentService.createAppointment(patientId, doctorId, appointmentDate);
    }
}
