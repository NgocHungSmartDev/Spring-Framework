package com.ngochung.securityjwt.repository;

import com.ngochung.securityjwt.entity.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
