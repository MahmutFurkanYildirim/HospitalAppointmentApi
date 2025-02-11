package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpecialtyDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String title;
    private List<DoctorDTO> doctors;
}
