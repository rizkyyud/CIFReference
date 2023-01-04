package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PersonalTransDest;
import com.kbbukopin.cif.referrence.cif.service.PersonalTransDestService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "personal-trans-dest/")
@AllArgsConstructor
public class PersonalTransDestController {
	private final PersonalTransDestService service;
	
	@GetMapping(path = "")
	private List<PersonalTransDest> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PersonalTransDest findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
