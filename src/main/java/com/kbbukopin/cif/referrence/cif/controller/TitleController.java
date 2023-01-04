package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.Title;
import com.kbbukopin.cif.referrence.cif.service.TitleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "title/")
@AllArgsConstructor
public class TitleController {
	private final TitleService service;
	
	@GetMapping(path = "")
	private List<Title> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private Title findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
