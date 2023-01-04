package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.ContactNoCc;
import com.kbbukopin.cif.referrence.cif.service.ContactNoCcService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "contact-no-cc/")
@AllArgsConstructor
public class ContactNoCcController {
	private final ContactNoCcService service;
	
	@GetMapping(path = "")
	private List<ContactNoCc> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private ContactNoCc findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
