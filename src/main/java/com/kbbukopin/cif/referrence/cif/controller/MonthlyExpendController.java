package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.MonthlyExpend;
import com.kbbukopin.cif.referrence.cif.service.MonthlyExpendService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "monthly-expend/")
@AllArgsConstructor
public class MonthlyExpendController {
	private final MonthlyExpendService service;
	
	@GetMapping(path = "")
	private List<MonthlyExpend> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private MonthlyExpend findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
