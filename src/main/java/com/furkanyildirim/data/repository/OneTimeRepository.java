package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.OneTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OneTimeRepository extends JpaRepository<OneTime, Long>{
    List<OneTime> findByDoctorId(Long doctorId);

    List<OneTime> findByDayOff(LocalDate dayOff);

    List<OneTime> findByDoctorIdAndIsOnLeave(Long doctorId, boolean isOnLeave);
}
