package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AddressMstVillage;
import com.kbbukopin.cif.referrence.cif.service.AddressMstVillageService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "address-mst-village/")
@AllArgsConstructor
public class AdressMasterVillageController {
	private final AddressMstVillageService service;
	
	@GetMapping(path = "")
	private List<AddressMstVillage> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AddressMstVillage findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping(path = "/findByDistrictCode/{districtCode}")
	private List<AddressMstVillage> findByDistrictCode(@PathVariable String districtCode){
		return service.findByDistrictCode(districtCode);
	}
}
