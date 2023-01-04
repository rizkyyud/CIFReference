package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ProvincesRepository;
import com.kbbukopin.cif.referrence.cif.model.Provinces;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProvincesService {
	private final ProvincesRepository ProvincesRepository;
	
	public List<Provinces> getAllData(){
		return ProvincesRepository.findAll();
	}
	
	public Provinces findById(Long id) throws Exception{
		return ProvincesRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
