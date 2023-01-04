package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.EntitiRepository;
import com.kbbukopin.cif.referrence.cif.model.Entiti;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EntitiService {
	private final EntitiRepository EntitiRepository;
	
	public List<Entiti> getAllData(){
		return EntitiRepository.findAll();
	}
	
	public Entiti findById(Long id) throws Exception{
		return EntitiRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
