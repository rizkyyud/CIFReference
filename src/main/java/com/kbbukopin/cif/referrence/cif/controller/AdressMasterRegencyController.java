package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AddressMstRegency;
import com.kbbukopin.cif.referrence.cif.service.AddressMstRegencyService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "address-mst-regency/")
@AllArgsConstructor
public class AdressMasterRegencyController {
	private final AddressMstRegencyService service;
	
	@GetMapping(path = "")
	private List<AddressMstRegency> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AddressMstRegency findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
