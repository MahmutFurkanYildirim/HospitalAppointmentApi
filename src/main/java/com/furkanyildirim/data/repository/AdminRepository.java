package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
}
