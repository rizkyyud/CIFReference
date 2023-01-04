package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Position;
import com.kbbukopin.cif.referrence.cif.service.PositionService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "position/")
@AllArgsConstructor
public class PositionController {
	private final PositionService service;
	
	@GetMapping(path = "")
	private List<Position> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Position findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
