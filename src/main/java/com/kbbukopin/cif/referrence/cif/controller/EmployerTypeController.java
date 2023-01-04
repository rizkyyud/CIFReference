package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.EmployerType;
import com.kbbukopin.cif.referrence.cif.service.EmployerTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "employer-type/")
@AllArgsConstructor
public class EmployerTypeController {
	private final EmployerTypeService service;
	
	@GetMapping(path = "")
	private List<EmployerType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private EmployerType findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
