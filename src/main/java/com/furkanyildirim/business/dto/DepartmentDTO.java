package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DepartmentDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String departmentName;
    private List<DoctorDTO> doctors;
    private List<AppointmentDTO> appointments;
}
