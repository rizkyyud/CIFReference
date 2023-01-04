package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OccupationRepository;
import com.kbbukopin.cif.referrence.cif.model.Occupation;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OccupationService {
	private final OccupationRepository OccupationRepository;
	
	public List<Occupation> getAllData(){
		return OccupationRepository.findAll();
	}
	
	public Occupation findById(Long id) throws Exception{
		return OccupationRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
