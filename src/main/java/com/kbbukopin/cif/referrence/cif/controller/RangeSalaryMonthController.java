package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.RangeSalaryMonth;
import com.kbbukopin.cif.referrence.cif.service.RangeSalaryMonthService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "range-salary-month/")
@AllArgsConstructor
public class RangeSalaryMonthController {
	private final RangeSalaryMonthService service;
	
	@GetMapping(path = "")
	private List<RangeSalaryMonth> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private RangeSalaryMonth findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
