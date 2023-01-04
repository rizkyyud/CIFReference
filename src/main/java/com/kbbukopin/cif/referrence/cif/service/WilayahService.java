package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.WilayahRepository;
import com.kbbukopin.cif.referrence.cif.model.Wilayah;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WilayahService {
	private final WilayahRepository repository;
	
	public List<Wilayah> getAllData(){
		return repository.findAll();
	}
	
	public Wilayah findById(String id) throws NotFoundException{
		return repository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}

	public List<Wilayah> findByProvCode(String provCode)  throws NotFoundException{
		return repository
				.findByProvCode(provCode);
	}
}
