package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Range50jt100m;
import com.kbbukopin.cif.referrence.cif.service.Range50jt100mService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "range-50jt-100m/")
@AllArgsConstructor
public class Range50jt100mController {
	private final Range50jt100mService service;
	
	@GetMapping(path = "")
	private List<Range50jt100m> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Range50jt100m findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
