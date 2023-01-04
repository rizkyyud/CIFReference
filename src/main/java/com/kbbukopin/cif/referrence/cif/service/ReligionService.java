package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ReligionRepository;
import com.kbbukopin.cif.referrence.cif.model.Religion;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReligionService {
	private final ReligionRepository ReligionRepository;
	
	public List<Religion> getAllData(){
		return ReligionRepository.findAll();
	}
	
	public Religion findById(Long id) throws Exception{
		return ReligionRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
