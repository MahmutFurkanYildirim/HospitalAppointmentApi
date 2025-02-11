package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.AppointmentTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface AppointmentTimeRepository extends JpaRepository<AppointmentTime, Long>{

    List<AppointmentTime> findByStartTimeAfter(LocalTime startTime);
}
