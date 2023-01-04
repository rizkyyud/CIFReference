package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PurposeOpeningAccount;
import com.kbbukopin.cif.referrence.cif.service.PurposeOpeningAccountService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "purpose-opening-account/")
@AllArgsConstructor
public class PurposeOpeningAccountController {
	private final PurposeOpeningAccountService service;
	
	@GetMapping(path = "")
	private List<PurposeOpeningAccount> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PurposeOpeningAccount findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
