package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Optionindisia;
import com.kbbukopin.cif.referrence.cif.service.OptionindisiaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "option_indisia/")
@AllArgsConstructor
public class OptionindisiaController {
	private final OptionindisiaService service;
	
	@GetMapping(path = "")
	private List<Optionindisia> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Optionindisia findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
