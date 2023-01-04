package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Relationship;
import com.kbbukopin.cif.referrence.cif.service.RelationshipService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "relationship/")
@AllArgsConstructor
public class RelationshipController {
	private final RelationshipService service;
	
	@GetMapping(path = "")
	private List<Relationship> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Relationship findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
