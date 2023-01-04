package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Entiti;
import com.kbbukopin.cif.referrence.cif.service.EntitiService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "entiti/")
@AllArgsConstructor
public class EntitiController {
	private final EntitiService service;
	
	@GetMapping(path = "")
	private List<Entiti> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Entiti findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
