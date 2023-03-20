package com.ngochung.securityjwt.repository;

import com.ngochung.securityjwt.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByEmail(String email);
}
