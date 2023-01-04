package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Gender;
import com.kbbukopin.cif.referrence.cif.service.GenderService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "gender/")
@AllArgsConstructor
public class GenderController {
	private final GenderService service;
	
	@GetMapping(path = "")
	private List<Gender> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Gender findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
