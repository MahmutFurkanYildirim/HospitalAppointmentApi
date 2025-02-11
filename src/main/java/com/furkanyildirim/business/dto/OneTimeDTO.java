package com.furkanyildirim.business.dto;

import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OneTimeDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private Long doctorId;
    private LocalDate day;
    private boolean isOnLeave;
    private List<OneTimeTimeBlockDTO> oneTimeTimeBlocks;
}
