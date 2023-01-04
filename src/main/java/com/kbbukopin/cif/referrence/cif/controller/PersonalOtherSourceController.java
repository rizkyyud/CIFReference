package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PersonalOtherSource;
import com.kbbukopin.cif.referrence.cif.service.PersonalOtherSourceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "personal-other-source/")
@AllArgsConstructor
public class PersonalOtherSourceController {
	private final PersonalOtherSourceService service;
	
	@GetMapping(path = "")
	private List<PersonalOtherSource> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PersonalOtherSource findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
