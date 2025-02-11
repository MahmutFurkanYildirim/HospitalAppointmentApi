package com.furkanyildirim.business.dto;

import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String surname;
    private Date birthdate;
    private String phoneNumber;
    private Double height;
    private Integer weight;
    private String email;
    private List<AppointmentDTO> appointments;
}
