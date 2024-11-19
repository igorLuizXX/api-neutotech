package com.igor.apineuro.dto;

import com.igor.apineuro.entity.TechnicalSkill;

public class TechnicalSkillDTO {
	
	private String name;
	private String description;
	private String level;
	
	
	public static TechnicalSkillDTO toDTO(TechnicalSkill technicalSkill) {

		 TechnicalSkillDTO dto = new  TechnicalSkillDTO();
		dto.setName(technicalSkill.getName());
		dto.setDescription(technicalSkill.getDescription());
		dto.setLevel(technicalSkill.getLevel());
		return dto;
	}
	
	public TechnicalSkill toEntity() {

		TechnicalSkill technicalSkill = new TechnicalSkill();
		
		technicalSkill.setName(this.getName());
		technicalSkill.setDescription(this.getDescription());
		technicalSkill.setLevel(this.getLevel());
		return technicalSkill;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
