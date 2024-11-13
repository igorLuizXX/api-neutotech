package com.igor.apineuro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.apineuro.entity.Certification;
import com.igor.apineuro.service.CertificationService;

@RestController
@RequestMapping("/certification")

public class CertificationController {

	private CertificationService certificationService;

	@Autowired
	public CertificationController(CertificationService certificationService) {
		this.certificationService = certificationService;
	}
}