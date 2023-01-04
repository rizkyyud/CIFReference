package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Hobby;
import com.kbbukopin.cif.referrence.cif.service.HobbyService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "hobby/")
@AllArgsConstructor
public class HobbyController {
	private final HobbyService service;
	
	@GetMapping(path = "")
	private List<Hobby> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Hobby findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
