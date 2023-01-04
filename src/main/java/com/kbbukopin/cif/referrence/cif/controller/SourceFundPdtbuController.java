package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.SourceFundPdtbu;
import com.kbbukopin.cif.referrence.cif.service.SourceFundPdtbuService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "source-fund-pdtbu/")
@AllArgsConstructor
public class SourceFundPdtbuController {
	private final SourceFundPdtbuService service;
	
	@GetMapping(path = "")
	private List<SourceFundPdtbu> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private SourceFundPdtbu findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
