package com.igor.apineuro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apineuro.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
