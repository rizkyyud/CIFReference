package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PjkFederal;
import com.kbbukopin.cif.referrence.cif.service.PjkFederalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "pjk-federal/")
@AllArgsConstructor
public class PjkFederalController {
	private final PjkFederalService service;
	
	@GetMapping(path = "")
	private List<PjkFederal> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PjkFederal findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
