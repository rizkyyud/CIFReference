package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AddressTypeOrg;
import com.kbbukopin.cif.referrence.cif.service.AddressTypeOrgService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "address-type-org/")
@AllArgsConstructor
public class AddressTypeOrgController {
	private final AddressTypeOrgService service;
	
	@GetMapping(path = "")
	private List<AddressTypeOrg> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AddressTypeOrg findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
