package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoutineDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private Long doctorId;
    private int dayOfWeek;
    private boolean isOnLeave;
    private List<TimeBlockDTO> timeBlocks;
}
