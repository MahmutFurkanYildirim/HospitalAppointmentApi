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

@Entity(name = "Patient")
@Table(name = "patient")
public class Patient implements Serializable {

    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    //patientID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //patientInformation
    @Column(name = "Name")
    private String name;
    @Column(name = "Email")
    private String email;

    //patientAppointmentInfo
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}
