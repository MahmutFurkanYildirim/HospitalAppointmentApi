package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminDTO implements Serializable{
    public static final Long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String surname;
    private Long accountId;
}
