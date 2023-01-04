package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.PenggunaanData;
import com.kbbukopin.cif.referrence.cif.service.PenggunaanDataService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "penggunaan-data/")
@AllArgsConstructor
public class PenggunaanDataController {
	private final PenggunaanDataService service;
	
	@GetMapping(path = "")
	private List<PenggunaanData> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private PenggunaanData findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
