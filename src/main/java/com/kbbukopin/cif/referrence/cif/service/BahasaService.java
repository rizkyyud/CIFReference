package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.BahasaRepository;
import com.kbbukopin.cif.referrence.cif.model.Bahasa;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BahasaService {
	private final BahasaRepository bahasaRepository;
	
	public List<Bahasa> getAllData(){
		return bahasaRepository.findAll();
	}
	
	public Bahasa findById(String id) throws Exception{
		return bahasaRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
