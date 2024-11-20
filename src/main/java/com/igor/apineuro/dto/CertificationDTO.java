package com.igor.apineuro.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.igor.apineuro.entity.Certification;

public class CertificationDTO {

	private String name;
	private String description;
	private String institution;
	private LocalDate startDate;
	private LocalDate expirationDate;

	public static CertificationDTO toDTO(Certification certification) {

		CertificationDTO dto = new CertificationDTO();
		dto.setName(certification.getName());
		dto.setDescription(certification.getDescription());
		dto.setInstitution(certification.getInstitution());
		dto.setStartDate(certification.getStartDate());
		dto.setExpirationDate(certification.getExpirationDate());
		return dto;
	}
	
	public static List<Certification> toEntityList(List<CertificationDTO> certifications) {
        return certifications.stream().map(CertificationDTO::toEntity).collect(Collectors.toList());
    }

	public Certification toEntity() {
		Certification certification = new Certification();
		certification.setName(this.getName());
		certification.setDescription(this.getDescription());
		certification.setInstitution(this.getInstitution());
		certification.setStartDate(this.getStartDate());
		certification.setExpirationDate(this.getExpirationDate());

		return certification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
