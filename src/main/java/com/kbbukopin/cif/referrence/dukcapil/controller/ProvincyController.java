package com.kbbukopin.cif.referrence.dukcapil.controller;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;
import com.kbbukopin.cif.referrence.dukcapil.service.ProvincyService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("dukcapil/provincy/")
@AllArgsConstructor
public class ProvincyController {
	private final ProvincyService service;
	
	@GetMapping("")
	private List<Provincy> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	private Provincy getById(@PathVariable String id) throws Exception{
		return service.findById(id);
	}
	
	@GetMapping("/{id}/regency")
	private Set<Regency> getAllRegency(@PathVariable String id) throws Exception{
		return service.getAllRegency(id);
	}
	
	@GetMapping("/{provName}/bukidesk")
	private Provinsi getProvinsiByProvId(@PathVariable String provName) throws Exception{
		return service.getProvinsiByProvId(provName);
	}
}
