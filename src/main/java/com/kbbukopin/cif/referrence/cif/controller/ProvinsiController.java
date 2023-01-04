package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.cif.service.ProvinsiService;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "provinsi/")
@AllArgsConstructor
public class ProvinsiController {
	private final ProvinsiService service;
	
	@GetMapping(path = "")
	private List<Provinsi> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Provinsi findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping(path = "{name}/dukcapil/")
	private Provincy getNameDukcapil(@PathVariable String name) throws Exception {
		return service.getProvinsiByName(name);
	}
}
