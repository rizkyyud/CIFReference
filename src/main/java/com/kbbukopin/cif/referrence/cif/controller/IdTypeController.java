package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.IdType;
import com.kbbukopin.cif.referrence.cif.service.IdTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "id-type/")
@AllArgsConstructor
public class IdTypeController {
	private final IdTypeService service;
	
	@GetMapping(path = "")
	private List<IdType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private IdType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
