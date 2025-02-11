package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.DoctorsDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorsDepartmentRepository extends JpaRepository<DoctorsDepartment, Long> {
    List<DoctorsDepartment> findByDoctorId(Long doctorId);

    List<DoctorsDepartment> findByDepartmentId(Long departmentId);
}
