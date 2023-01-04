package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.HousingType;
import com.kbbukopin.cif.referrence.cif.service.HousingTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "housing-type/")
@AllArgsConstructor
public class HousingTypeController {
	private final HousingTypeService service;
	
	@GetMapping(path = "")
	private List<HousingType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private HousingType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
