package com.furkanyildirim.business.dto;

import com.furkanyildirim.data.entity.Status;
import com.furkanyildirim.role.EStatus;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusDTO implements Serializable{

    public static final Long serialVersionUID = 1L;
    private Long id;
    @Builder.Default
    private EStatus name = EStatus.BEKLEMEDE;
    private List<AppointmentDTO> appointments;
}
