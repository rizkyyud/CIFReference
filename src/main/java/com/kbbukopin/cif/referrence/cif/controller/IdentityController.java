package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Identitas;
import com.kbbukopin.cif.referrence.cif.service.IdentityService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "identity/")
@AllArgsConstructor
public class IdentityController {
	private final IdentityService service;
	
	@GetMapping(path = "")
	private List<Identitas> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Identitas findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
