package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Wilayah;
import com.kbbukopin.cif.referrence.cif.service.WilayahService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "wilayah/")
@AllArgsConstructor
public class WilayahController {
	private final WilayahService service;
	
	@GetMapping(path = "")
	private List<Wilayah> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Wilayah findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping(path = "/provCode/{provCode}")
	private List<Wilayah> findByProvCode(@PathVariable String provCode) throws Exception {
		return service.findByProvCode(provCode);
	}
}
