package com.furkanyildirim.business.dto;

import lombok.*;
import java.io.Serializable;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OneTimeTimeBlockDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private LocalTime startTime;
    private LocalTime endTime;
    private Long oneTimeId;
}
