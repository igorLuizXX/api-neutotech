package com.igor.apineuro.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.igor.apineuro.dto.EmployeeDTO;
import com.igor.apineuro.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private final EmployeeService employeeService; 
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeDTO> getALLEmployee() {
		return employeeService.findAll(); 
	}
	@GetMapping ("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id){
		return employeeService.getEmployeeById(id);
		
	}
	
	@PostMapping
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.createEmployee(employeeDTO); 
	}
	
    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteEmployee (@PathVariable Long id){
    	employeeService.deleteEmployee(id);
    	return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee 
    (@PathVariable Long id,@RequestBody EmployeeDTO employee ) { 
    	return employeeService.updateEmployee(id, employee);
    	
    }
}
