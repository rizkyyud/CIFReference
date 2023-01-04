package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Bahasa;
import com.kbbukopin.cif.referrence.cif.service.BahasaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "bahasa/")
@AllArgsConstructor
public class BahasaController {
	private final BahasaService service;
	
	@GetMapping(path = "")
	private List<Bahasa> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Bahasa findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
