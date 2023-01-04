package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.CountryRepository;
import com.kbbukopin.cif.referrence.cif.model.Country;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountryService {
	private final CountryRepository CountryRepository;
	
	public List<Country> getAllData(){
		return CountryRepository.findAll();
	}
	
	public Country findById(String id) throws Exception{
		return CountryRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
