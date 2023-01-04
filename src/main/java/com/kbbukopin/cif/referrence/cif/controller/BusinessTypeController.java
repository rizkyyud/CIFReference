package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.BusinessType;
import com.kbbukopin.cif.referrence.cif.service.BusinessTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "business-type/")
@AllArgsConstructor
public class BusinessTypeController {
	private final BusinessTypeService service;
	
	@GetMapping(path = "")
	private List<BusinessType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private BusinessType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
