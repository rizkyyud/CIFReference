package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.ResikoNasabah;
import com.kbbukopin.cif.referrence.cif.service.ResikoNasabahService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "resiko-nasabah/")
@AllArgsConstructor
public class ResikoNasabahController {
	private final ResikoNasabahService service;
	
	@GetMapping(path = "")
	private List<ResikoNasabah> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private ResikoNasabah findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
