package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.CitizenCode;
import com.kbbukopin.cif.referrence.cif.service.CitizenCodeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "citizen-code/")
@AllArgsConstructor
public class CitizenCodeController {
	private final CitizenCodeService service;
	
	@GetMapping(path = "")
	private List<CitizenCode> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private CitizenCode findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
