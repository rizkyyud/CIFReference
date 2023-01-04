package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Resident;
import com.kbbukopin.cif.referrence.cif.service.ResidentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "resident/")
@AllArgsConstructor
public class ResidentController {
	private final ResidentService service;
	
	@GetMapping(path = "")
	private List<Resident> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Resident findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
