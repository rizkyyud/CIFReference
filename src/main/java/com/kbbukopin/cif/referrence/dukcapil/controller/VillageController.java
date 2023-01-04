package com.kbbukopin.cif.referrence.dukcapil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Village;
import com.kbbukopin.cif.referrence.dukcapil.service.VillageService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "dukcapil/village/")
@AllArgsConstructor
public class VillageController {
	private final VillageService service;
	
	@GetMapping("{id}")
	public Village findById(@PathVariable String id) throws NotFoundException {
		return service.findById(id);
	}
	
	@GetMapping("{id}/district")
	public District getDistrict(@PathVariable String id) throws NotFoundException {
		return service.getDistrict(id);
	}
	
}
