package com.jpalearning.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpalearning.sb.entity.Employee;
import com.jpalearning.sb.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepository;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployees(@RequestBody Employee empdata)
	{
		empRepository.save(empdata);
		return ResponseEntity.ok("Data saved");
	}
}
