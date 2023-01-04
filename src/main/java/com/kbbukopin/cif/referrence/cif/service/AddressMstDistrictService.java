package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AddressMasterDistrictRepository;
import com.kbbukopin.cif.referrence.cif.model.AddressMstDistrict;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressMstDistrictService {
	private final AddressMasterDistrictRepository repository;
	
	public List<AddressMstDistrict> getAllData(){
		return repository.findAll();
	}
	
	public AddressMstDistrict findById(String id) throws Exception{
		return repository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}

	public List<AddressMstDistrict> findByRegencyCode(String regencyCode) {
		return repository.findByRegencyCode(regencyCode);
	}
}
