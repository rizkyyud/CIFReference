package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.JenisIzinTinggal;
import com.kbbukopin.cif.referrence.cif.service.JenisIzinTinggalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "jenis-izin-tinggal/")
@AllArgsConstructor
public class JenisIzinTinggalController {
	private final JenisIzinTinggalService service;
	
	@GetMapping(path = "")
	private List<JenisIzinTinggal> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private JenisIzinTinggal findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
