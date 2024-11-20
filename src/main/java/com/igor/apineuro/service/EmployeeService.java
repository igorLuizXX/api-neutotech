package com.igor.apineuro.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.igor.apineuro.dto.EmployeeDTO;
import com.igor.apineuro.entity.Employee;
import com.igor.apineuro.repository.EmployeeRepository;

@Service
public class EmployeeService {

	public final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<EmployeeDTO> findAll() {
		return employeeRepository.findAll().stream()
		 .map(EmployeeDTO::fromEntity)
		.collect(Collectors.toList());
	}
	
	public ResponseEntity<EmployeeDTO> getEmployeeById(long id){
		return employeeRepository.findById(id)
				.map(EmployeeDTO::fromEntity)
				.map(employee -> ResponseEntity.ok(employee))
				.orElse(ResponseEntity.notFound().build());
	}
	
	public EmployeeDTO createEmployee(EmployeeDTO employeeDto) {
		  Employee employee = employeeDto.toEntity();
	
		  Employee saved = employeeRepository.save(employee);
		  return EmployeeDTO.fromEntity(saved);
	
	}
	
	public void deleteEmployee(Long id) { 
		
		  employeeRepository.deleteById(id);
	}
	 public ResponseEntity<EmployeeDTO> updateEmployee(Long id, EmployeeDTO employeeDto) {
		 return employeeRepository.findById(id).map(employeeToSave -> {
			 employeeToSave.setName(employeeDto.getName());
             employeeToSave.setEmail(employeeDto.getEmail());
             employeeToSave.setPhone(employeeDto.getPhone());
             employeeToSave.setExperienceTime(employeeDto.getExperienceTime());
             employeeToSave.setLinkedinUrl(employeeDto.getLinkedinUrl());
             
             
             return employeeRepository.save(employeeToSave);
         })
				 .map(EmployeeDTO::fromEntity)
				 .map(ResponseEntity::ok)
				 .orElse(ResponseEntity.notFound().build());
             
             
		 }
}
