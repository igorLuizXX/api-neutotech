package com.igor.apineuro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.igor.apineuro.entity.TechnicalSkill;
import com.igor.apineuro.repository.TechnicalSkillRepository;

@Service
public class TechnicalSkillService {
	
	@Autowired
	private TechnicalSkillRepository technicalSkillRepository;

    public List<TechnicalSkill> findAll() {
        return technicalSkillRepository.findAll();
    }

    public Optional<TechnicalSkill> findById(Long id) {
        return technicalSkillRepository.findById(id);
    }

    public TechnicalSkill save(TechnicalSkill technicalSkill) {
        return technicalSkillRepository.save(technicalSkill);
    }

    public void deleteById(Long id) {
        technicalSkillRepository.deleteById(id);
    }
}
