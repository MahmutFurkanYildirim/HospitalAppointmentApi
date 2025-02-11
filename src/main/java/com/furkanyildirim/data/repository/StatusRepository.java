package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Status;
import com.furkanyildirim.role.EStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{
    Optional<Status> findByName(EStatus name);
}
