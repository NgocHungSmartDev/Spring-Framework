package com.ngochung.securityjwt.repository;

import com.ngochung.securityjwt.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards, Long> {
    List<Cards> findByCustomerId(int customerId);
}
