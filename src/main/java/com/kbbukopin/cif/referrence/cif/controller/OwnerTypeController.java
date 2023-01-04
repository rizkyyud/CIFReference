package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.OwnerType;
import com.kbbukopin.cif.referrence.cif.service.OwnerTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "owner-type/")
@AllArgsConstructor
public class OwnerTypeController {
	private final OwnerTypeService service;
	
	@GetMapping(path = "")
	private List<OwnerType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private OwnerType findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
