package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.OwnershipType;
import com.kbbukopin.cif.referrence.cif.service.OwnershipTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "ownership-type/")
@AllArgsConstructor
public class OwnershipTypeController {
	private final OwnershipTypeService service;
	
	@GetMapping(path = "")
	private List<OwnershipType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private OwnershipType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
