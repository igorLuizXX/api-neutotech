package com.igor.apineuro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.igor.apineuro.entity.Certification;
import com.igor.apineuro.service.CertificationService;

@RestController
@RequestMapping("/certification")

public class CertificationController {

	private final CertificationService certificationService;

	@Autowired
	public CertificationController(CertificationService certificationService) {
		this.certificationService = certificationService;
	}
	@GetMapping
    public List<Certification> getAllCertifications() {
        return certificationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certification> getCertificationById(@PathVariable Long id) {
        return certificationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Certification createCertification(@RequestBody Certification certification) {
        return certificationService.save(certification);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertification(@PathVariable Long id) {
        certificationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}