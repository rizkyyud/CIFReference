package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Race;
import com.kbbukopin.cif.referrence.cif.service.RaceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "race/")
@AllArgsConstructor
public class RaceController {
	private final RaceService service;
	
	@GetMapping(path = "")
	private List<Race> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Race findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
