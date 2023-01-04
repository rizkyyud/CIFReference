package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AddressType;
import com.kbbukopin.cif.referrence.cif.service.AddressTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "adress-type/")
@AllArgsConstructor
public class AddressTypeController {
	private final AddressTypeService service;
	
	@GetMapping(path = "")
	private List<AddressType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AddressType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
