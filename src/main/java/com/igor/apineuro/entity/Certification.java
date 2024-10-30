package com.igor.apineuro.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Certification {
	@Id
	@GeneratedValue
	
	private Long id; 
	private String name; 
	private String description; 
	private String institution; 
	private LocalDate starDate; 
	private LocalDate expirationDate; 
	
	@ManyToOne (
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL 
)
	@JoinColumn (name = "employee_id")
	public Employee employee;
	
		
	

}
