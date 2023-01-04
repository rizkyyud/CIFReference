package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Provinces;
import com.kbbukopin.cif.referrence.cif.service.ProvincesService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "provinces/")
@AllArgsConstructor
public class ProvincesController {
	private final ProvincesService service;
	
	@GetMapping(path = "")
	private List<Provinces> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Provinces findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
