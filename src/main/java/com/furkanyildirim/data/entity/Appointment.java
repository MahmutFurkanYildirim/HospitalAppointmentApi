package com.furkanyildirim.data.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity(name = "Appointment")
@Table(name = "appointment")
public class Appointment implements Serializable {

    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    //appointmentID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime appointmentDate;

    //patientID
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    //doctorID
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

}
