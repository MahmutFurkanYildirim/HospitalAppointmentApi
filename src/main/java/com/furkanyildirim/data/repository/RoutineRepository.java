package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long>{
    List<Routine> findByDoctorId(Long doctorId);

    List<Routine> findByDayOfWeek(int dayOfWeek);
}
