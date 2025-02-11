package com.furkanyildirim.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name = "Department")
@Table(name = "department")
public class Department implements Serializable {
    private static final Long serialVersionUID = 1L;

    //departmentID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //departmentTitle
    @Column(name = "Name")
    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctors;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;
}
