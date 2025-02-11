package com.furkanyildirim.business.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDTO implements Serializable{
    public static final Long serialVersionUID = 1L;
    private Long id;
    private String name;
    private List<AccountDTO> accounts;
}
