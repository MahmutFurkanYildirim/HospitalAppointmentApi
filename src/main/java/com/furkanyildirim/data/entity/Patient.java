package com.furkanyildirim.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
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
    private static final Long serialVersionUID = 1L;

    //patientID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //patientInformation
    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    //patientAppointmentInfo
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}
