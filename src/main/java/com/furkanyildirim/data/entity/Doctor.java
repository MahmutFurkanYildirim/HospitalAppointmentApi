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

    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    //doctorID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //doctorInformation
    private String name;
    private String specialty;

    //doctorAppointmentList
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;

}
