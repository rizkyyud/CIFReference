package com.kbbukopin.cif.referrence.cif.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbbukopin.cif.referrence.cif.model.AssetType;
import com.kbbukopin.cif.referrence.cif.service.AssetTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "asset-type/")
@AllArgsConstructor
public class AssetTypeController {
	private final AssetTypeService service;
	
	@GetMapping(path = "")
	private List<AssetType> getAll(){
		return service.getAllData();
	}
	
	@GetMapping(path = "/{id}")
	private AssetType findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
}
