package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.ManagementType;
import com.kbbukopin.cif.referrence.cif.service.ManagementTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "management-type/")
@AllArgsConstructor
public class ManagementTypeController {
	private final ManagementTypeService service;
	
	@GetMapping(path = "")
	private List<ManagementType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private ManagementType findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
