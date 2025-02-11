package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String surname;
    private Long departmentId;
    private Long specialtyId;
    private List<AppointmentDTO> appointments;
}
