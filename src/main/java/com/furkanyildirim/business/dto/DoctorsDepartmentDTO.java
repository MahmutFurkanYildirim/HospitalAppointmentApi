package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorsDepartmentDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private Long doctorId;
    private Long departmentId;
}
