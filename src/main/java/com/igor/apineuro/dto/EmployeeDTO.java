 package com.igor.apineuro.dto;

import java.util.ArrayList;
import java.util.List;

import com.igor.apineuro.entity.Certification;
import com.igor.apineuro.entity.Employee;
import com.igor.apineuro.entity.TechnicalSkill;


public class EmployeeDTO {
	
	private String name;
	private String phone;
	private String email;
	private String experienceTime;
	private String linkedinUrl;
	private List<CertificationDTO> certifications = new ArrayList<>();
	private List<TechnicalSkillDTO> technicalSkills = new ArrayList<>();
	
	public static EmployeeDTO toDTO(Employee employee) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setName(employee.getName());
		dto.setEmail(employee.getEmail());
		dto.setPhone(employee.getPhone());
	
		for (Certification certification : employee.getCertifications()) {
			dto.getCertifications().add(CertificationDTO.toDTO(certification));
		}
		
		for (TechnicalSkill technicalSkill : employee.getTechnicalSkills()) {
			dto.getTechnicalSkills().add(TechnicalSkillDTO.toDTO(technicalSkill));
		}
		
		dto.setExperienceTime(employee.getExperienceTime());
		dto.setLinkedinUrl(employee.getLinkedinUrl());
		return dto;
		
	}
	
	public Employee toEntity() {
		Employee employee = new Employee();
		employee.setName(this.getName());
		employee.setEmail(this.getEmail());
		employee.setPhone(this.getPhone());
		employee.setExperienceTime(this.getExperienceTime());
		employee.setLinkedinUrl(this.getLinkedinUrl());
		return employee;
	}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperienceTime() {
		return experienceTime;
	}

	public void setExperienceTime(String experienceTime) {
		this.experienceTime = experienceTime;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public List<CertificationDTO> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<CertificationDTO> certifications) {
		this.certifications = certifications;
	}

	public List<TechnicalSkillDTO> getTechnicalSkills() {
		return technicalSkills;
	}

	public void setTechnicalSkills(List<TechnicalSkillDTO> technicalSkills) {
		this.technicalSkills = technicalSkills;
	}
	
	
}
