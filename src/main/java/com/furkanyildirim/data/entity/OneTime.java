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

@Entity
@Table(name = "one_time")
public class OneTime implements Serializable{
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doctor_id", nullable = false)
    private Long doctorId;

    @Column(name = "day", nullable = false)
    private LocalDate day;

    @Column(name = "is_on_leave", nullable = false)
    private boolean isOnLeave;

    @ManyToOne
    @JoinColumn(name = "doctor_id", insertable = false, updatable = false)
    private Doctor doctor;

    @OneToMany(mappedBy = "oneTime", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OneTimeTimeBlock> oneTimeTimeBlocks;
}
