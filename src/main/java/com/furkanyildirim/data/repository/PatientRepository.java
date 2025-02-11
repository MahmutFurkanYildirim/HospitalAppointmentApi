package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByName(String name);

    List<Patient> findBySurname(String surname);

    List<Patient> findByBirthdate(LocalDate birthdate);
}
