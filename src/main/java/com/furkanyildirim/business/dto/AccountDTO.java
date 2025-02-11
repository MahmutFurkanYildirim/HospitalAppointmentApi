package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AccountDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String email;
    private String firebaseUid;
    private Long roleId;

    private List<AdminDTO> admins;
    private List<DoctorDTO> doctors;
    private List<PatientDTO> patients;
}
