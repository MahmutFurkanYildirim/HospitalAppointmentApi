package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.OneTimeTimeBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface OneTimeTimeBlockRepository extends JpaRepository<OneTimeTimeBlock, Long>{
    List<OneTimeTimeBlock> findByOneTimeId(Long oneTimeId);

    List<OneTimeTimeBlock> findByStartTimeBetween(LocalTime startTime, LocalTime endTime);
}
