package com.ngochung.securityjwt.repository;

import com.ngochung.securityjwt.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
