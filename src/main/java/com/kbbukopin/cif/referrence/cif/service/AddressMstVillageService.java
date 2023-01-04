package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AddressMasterVillageRepository;
import com.kbbukopin.cif.referrence.cif.model.AddressMstVillage;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressMstVillageService {
	private final AddressMasterVillageRepository repository;
	
	public List<AddressMstVillage> getAllData(){
		return repository.findAll();
	}
	
	public AddressMstVillage findById(String id) throws Exception{
		return repository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}

	public List<AddressMstVillage> findByDistrictCode(String districtCode) {
		return repository.findByDistrictCode(districtCode);
	}
}
