package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.FamiliarBKP;
import com.kbbukopin.cif.referrence.cif.service.FamiliarBKPService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "familiar-bkp/")
@AllArgsConstructor
public class FamiliarBKPController {
	private final FamiliarBKPService service;
	
	@GetMapping(path = "")
	private List<FamiliarBKP> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private FamiliarBKP findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
