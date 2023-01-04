package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.HighEducationRepository;
import com.kbbukopin.cif.referrence.cif.model.HighEducation;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HighEducationService {
	private final HighEducationRepository HighEducationRepository;
	
	public List<HighEducation> getAllData(){
		return HighEducationRepository.findAll();
	}
	
	public HighEducation findById(Long id) throws Exception{
		return HighEducationRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
