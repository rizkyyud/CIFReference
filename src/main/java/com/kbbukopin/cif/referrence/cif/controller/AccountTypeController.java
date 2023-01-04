package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AccountType;
import com.kbbukopin.cif.referrence.cif.service.AccountTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "account-type/")
@AllArgsConstructor
public class AccountTypeController {
	private final AccountTypeService service;
	
	@GetMapping(path = "")
	private List<AccountType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AccountType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
