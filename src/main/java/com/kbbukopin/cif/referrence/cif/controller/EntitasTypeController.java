package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.EntitasType;
import com.kbbukopin.cif.referrence.cif.service.EntitasTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "entitas-type/")
@AllArgsConstructor
public class EntitasTypeController {
	private final EntitasTypeService service;
	
	@GetMapping(path = "")
	private List<EntitasType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private EntitasType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
