package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Ownership;
import com.kbbukopin.cif.referrence.cif.service.OwnershipService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "ownership/")
@AllArgsConstructor
public class OwnershipController {
	private final OwnershipService service;
	
	@GetMapping(path = "")
	private List<Ownership> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Ownership findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
