package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.MaritalStatus;
import com.kbbukopin.cif.referrence.cif.service.MaritalStatusService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "marital-status/")
@AllArgsConstructor
public class MaritalStatusController {
	private final MaritalStatusService service;
	
	@GetMapping(path = "")
	private List<MaritalStatus> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private MaritalStatus findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
