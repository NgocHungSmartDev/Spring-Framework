package com.ngochung.securityjwt.repository;

import com.ngochung.securityjwt.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
