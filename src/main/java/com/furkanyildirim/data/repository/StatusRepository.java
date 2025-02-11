package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{
    Status findByName(String name);
}
