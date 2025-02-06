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

@Entity(name = "Specialty")
@Table(name = "specialty")
public class Specialty implements Serializable {
    // SERILESTIRME
    public static final Long serialVersionUID = 1L;

    //specialtyID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //specialtyTitle
    @Column(name = "Name")
    private String title;

    @OneToMany(mappedBy = "title", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctors;

}
