package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.SourceOfFunds;
import com.kbbukopin.cif.referrence.cif.service.SourceOfFundsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "source-Of-funds/")
@AllArgsConstructor
public class SourceOfFundsController {
	private final SourceOfFundsService service;
	
	@GetMapping(path = "")
	private List<SourceOfFunds> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private SourceOfFunds findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
