package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Occupation;
import com.kbbukopin.cif.referrence.cif.service.OccupationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "occupation/")
@AllArgsConstructor
public class OccupationController {
	private final OccupationService service;
	
	@GetMapping(path = "")
	private List<Occupation> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Occupation findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
