package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.HighEducation;
import com.kbbukopin.cif.referrence.cif.service.HighEducationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "high-education/")
@AllArgsConstructor
public class HighEducationController {
	private final HighEducationService service;
	
	@GetMapping(path = "")
	private List<HighEducation> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private HighEducation findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
