package com.furkanyildirim.business.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Data // @Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder

public class PatientDTO implements Serializable {
    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
}
