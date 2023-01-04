package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.OrganizationType;
import com.kbbukopin.cif.referrence.cif.service.OrganizationTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "organization-type/")
@AllArgsConstructor
public class OrganizationTypeController {
	private final OrganizationTypeService service;
	
	@GetMapping(path = "")
	private List<OrganizationType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private OrganizationType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
