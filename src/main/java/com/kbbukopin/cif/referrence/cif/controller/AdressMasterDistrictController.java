package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AddressMstDistrict;
import com.kbbukopin.cif.referrence.cif.service.AddressMstDistrictService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "address-mst-district/")
@AllArgsConstructor
public class AdressMasterDistrictController {
	private final AddressMstDistrictService service;
	
	@GetMapping(path = "")
	private List<AddressMstDistrict> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AddressMstDistrict findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping(path = "findByRegencyCode/{regencyCode}")
	private List<AddressMstDistrict> regencyCode(@PathVariable String regencyCode) throws Exception {
		return service.findByRegencyCode(regencyCode);
	}
}
