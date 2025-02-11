package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByDepartmentId(Long departmentId);

    List<Doctor> findByTitleId(Long titleId);

    List<Doctor> findByNameAndSurname(String name, String surname);
}
