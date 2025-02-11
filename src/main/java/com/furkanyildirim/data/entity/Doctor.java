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

@Entity(name = "Doctor")
@Table(name = "doctor")
public class Doctor implements Serializable {
    private static final Long serialVersionUID = 1L;

    //doctorID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //doctorInformation
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "speciality")
    private Specialty title;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    //doctorAppointmentList
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;


}
