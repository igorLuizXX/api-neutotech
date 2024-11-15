package com.igor.apineuro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apineuro.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}