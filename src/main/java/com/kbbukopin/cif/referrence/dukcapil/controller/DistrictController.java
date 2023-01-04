package com.kbbukopin.cif.referrence.dukcapil.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;
import com.kbbukopin.cif.referrence.dukcapil.model.Village;
import com.kbbukopin.cif.referrence.dukcapil.service.DistrictService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "dukcapil/district/")
@AllArgsConstructor
public class DistrictController {
	private final DistrictService service;
	
	@GetMapping("{id}")
	public District findById(@PathVariable String id) throws NotFoundException {
		return service.findById(id);
	}
	
	@GetMapping("{id}/village")
	public Set<Village> getVillages(@PathVariable String id) throws NotFoundException{
		return service.getVillages(id);
	}
	
	@GetMapping("{id}/regency")
	public Regency getRegency(@PathVariable String id) throws NotFoundException{
		return service.getRegency(id);
	}
}
