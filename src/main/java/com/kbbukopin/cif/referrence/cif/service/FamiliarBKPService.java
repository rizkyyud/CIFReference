package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.FamiliarBKPRepository;
import com.kbbukopin.cif.referrence.cif.model.FamiliarBKP;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FamiliarBKPService {
	private final FamiliarBKPRepository FamiliarBKPRepository;
	
	public List<FamiliarBKP> getAllData(){
		return FamiliarBKPRepository.findAll();
	}
	
	public FamiliarBKP findById(Long id) throws Exception{
		return FamiliarBKPRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
