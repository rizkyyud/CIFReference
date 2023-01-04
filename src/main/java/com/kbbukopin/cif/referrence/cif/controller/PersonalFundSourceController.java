package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PersonalFundSource;
import com.kbbukopin.cif.referrence.cif.service.PersonalFundSourceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "personal-fund-source/")
@AllArgsConstructor
public class PersonalFundSourceController {
	private final PersonalFundSourceService service;
	
	@GetMapping(path = "")
	private List<PersonalFundSource> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PersonalFundSource findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
