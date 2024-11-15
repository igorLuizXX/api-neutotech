package com.igor.apineuro.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import com.igor.apineuro.entity.Certification;
import com.igor.apineuro.repository.CertificationRepository;

@Service
public class CertificationService {
	
	 @Autowired
	    private CertificationRepository certificationRepository;

	    public List<Certification> findAll() {
	        return certificationRepository.findAll();
	    }

	    public Optional<Certification> findById(Long id) {
	        return certificationRepository.findById(id);
	    }

	    public Certification save(Certification certification) {
	        return certificationRepository.save(certification);
	    }

	    public void deleteById(Long id) {
	        certificationRepository.deleteById(id);
	    }

}
