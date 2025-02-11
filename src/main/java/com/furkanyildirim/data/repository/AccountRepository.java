package com.furkanyildirim.data.repository;

import com.furkanyildirim.data.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

    // Kullanıcı adı ile arama
    Optional<Account> findByUserName(String userName);

    // E-posta ile arama
    Optional<Account> findByEmail(String email);

}
