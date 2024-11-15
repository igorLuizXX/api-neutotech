package com.igor.apineuro.controller;

	import java.util.List;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;
	import com.igor.apineuro.entity.TechnicalSkill;
	import com.igor.apineuro.service.TechnicalSkillService;

	public class TechnicalSkillController {

		private final TechnicalSkillService technicalSkillService;

	    public TechnicalSkillController(TechnicalSkillService technicalSkillService) {
	        this.technicalSkillService = technicalSkillService;
	    }

	    @GetMapping
	    public List<TechnicalSkill> getAllTechnicalSkills() {
	        return technicalSkillService.findAll();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<TechnicalSkill> getTechnicalSkillById(@PathVariable Long id) {
	        return technicalSkillService.findById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PostMapping
	    public TechnicalSkill createTechnicalSkill(@RequestBody TechnicalSkill technicalSkill) {
	        return technicalSkillService.save(technicalSkill);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteTechnicalSkill(@PathVariable Long id) {
	        technicalSkillService.deleteById(id);
	        return ResponseEntity.noContent().build();
	    }

}
