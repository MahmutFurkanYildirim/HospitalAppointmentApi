package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.TimeBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface TimeBlockRepository extends JpaRepository<TimeBlock, Long>{
    List<TimeBlock> findByRoutineId(Long routineId);

    List<TimeBlock> findByStartTimeAfter(LocalTime startTime);
}
