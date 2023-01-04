package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.CustomerType;
import com.kbbukopin.cif.referrence.cif.service.CustomerTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "customer-type/")
@AllArgsConstructor
public class CustomerTypeController {
	private final CustomerTypeService service;
	
	@GetMapping(path = "")
	private List<CustomerType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private CustomerType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
