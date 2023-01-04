package com.kbbukopin.cif.referrence.dukcapil.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;
import com.kbbukopin.cif.referrence.dukcapil.service.RegencyService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("dukcapil/regency/")
public class RegencyController {
	private final RegencyService service;
	
	/*
	 * Jangan dinyalain berat
	 * */
//	@GetMapping("")
//	private List<Regency> findAll(){
//		return service.findAll();
//	}
	
	@GetMapping("{id}")
	private Regency findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping("{id}/provincy")
	private Provincy getProvincy(@PathVariable String id) throws Exception {
		return service.getProvincy(id);
	}
	
	@GetMapping("{id}/district")
	private Set<District> getDistrict(@PathVariable String id) throws Exception {
		return service.getDistrict(id);
	}

}
