package com.furkanyildirim.controller.Impl;

import com.furkanyildirim.business.dto.AppointmentDTO;
import com.furkanyildirim.business.service.Impl.AppointmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public AppointmentDTO createAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        return appointmentService.createAppointment(appointmentDTO);
    }

    @GetMapping
    public Page<AppointmentDTO> getAllAppointments(Pageable pageable) {
        return appointmentService.getAllAppointments(pageable);
    }
}
