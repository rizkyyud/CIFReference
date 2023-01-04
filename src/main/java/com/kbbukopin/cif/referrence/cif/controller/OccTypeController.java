package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.OccType;
import com.kbbukopin.cif.referrence.cif.service.OccTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "occ-type/")
@AllArgsConstructor
public class OccTypeController {
	private final OccTypeService service;
	
	@GetMapping(path = "")
	private List<OccType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private OccType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
