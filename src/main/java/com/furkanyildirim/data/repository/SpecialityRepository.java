package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Specialty, Long> {
}
