package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AppointmentDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private LocalDateTime appointmentDate;
    private Long departmentId;
    private String detail;
    private Long doctorId;
    private Long patientId;
    private Long statusId;
    private String prescription;
    private List<AppointmentTimeDTO> appointmentTimes;
}
