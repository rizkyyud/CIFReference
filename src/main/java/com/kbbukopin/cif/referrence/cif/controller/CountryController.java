package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Country;
import com.kbbukopin.cif.referrence.cif.service.CountryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "country/")
@AllArgsConstructor
public class CountryController {
	private final CountryService service;
	
	@GetMapping(path = "")
	private List<Country> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Country findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
