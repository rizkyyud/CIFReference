package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Yesorno;
import com.kbbukopin.cif.referrence.cif.service.YesornoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "yesorno/")
@AllArgsConstructor
public class YesornoController {
	private final YesornoService service;
	
	@GetMapping(path = "")
	private List<Yesorno> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Yesorno findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
