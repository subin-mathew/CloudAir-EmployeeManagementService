package com.cloudair.employeemangementservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class EmployeeController {
	
	@Value("${xmas-fifth-day.partridges.location}")
	private String dtsource;
	
	@GetMapping("/test")
	public String test() {
		return dtsource;
	}

}
