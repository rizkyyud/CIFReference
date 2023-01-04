package com.kbbukopin.cif.referrence.dukcapil.service;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.dao.VillageRepository;
import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Village;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VillageService {
	private final VillageRepository repository;
	
	public Village findById(String id) throws NotFoundException {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}
	
	public District getDistrict(String id) throws NotFoundException{
		Village village = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		return village.getDistrict();
	}
}
