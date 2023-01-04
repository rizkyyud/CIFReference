package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.OccasionCC;
import com.kbbukopin.cif.referrence.cif.service.OccasionCCService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "occasion-cc/")
@AllArgsConstructor
public class OccasionCCController {
	private final OccasionCCService service;
	
	@GetMapping(path = "")
	private List<OccasionCC> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private OccasionCC findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
