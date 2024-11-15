package com.igor.apineuro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apineuro.entity.TechnicalSkill;

@Repository
public interface TechnicalSkillRepository extends JpaRepository<TechnicalSkill, Long> {
	
}
