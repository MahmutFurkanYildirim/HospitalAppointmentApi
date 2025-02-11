package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeBlockDTO implements Serializable {
    public static final Long serialVersionUID = 1L;
    private Long id;
    private LocalTime startTime;
    private LocalTime endTime;
    private Long routineId;
}
