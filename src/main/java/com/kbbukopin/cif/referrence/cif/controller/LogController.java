package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Log;
import com.kbbukopin.cif.referrence.cif.service.LogService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "log/")
@AllArgsConstructor
public class LogController {
	private final LogService service;
	
	@GetMapping(path = "")
	private List<Log> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Log findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
}
