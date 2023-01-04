package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.ReasonCreateAccount;
import com.kbbukopin.cif.referrence.cif.service.ReasonCreateAccountService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "reason-create-account/")
@AllArgsConstructor
public class ReasonCreateAccountController {
	private final ReasonCreateAccountService service;
	
	@GetMapping(path = "")
	private List<ReasonCreateAccount> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private ReasonCreateAccount findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
