package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AssetClass;
import com.kbbukopin.cif.referrence.cif.service.AssetClassService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "asset-class/")
@AllArgsConstructor
public class AssetClassController {
	private final AssetClassService service;
	
	@GetMapping(path = "")
	private List<AssetClass> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AssetClass findById(@PathVariable String id) throws Exception {
		return service.findById(id);
	}
	
	@GetMapping(path = "findByClassType/{classType}")
	private List<AssetClass> findByClassType(@PathVariable String classType){
		return service.findByClassType(classType);
	}
}
