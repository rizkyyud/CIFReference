package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ResidentRepository;
import com.kbbukopin.cif.referrence.cif.model.Resident;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResidentService {
	private final ResidentRepository ResidentRepository;
	
	public List<Resident> getAllData(){
		return ResidentRepository.findAll();
	}
	
	public Resident findById(Long id) throws Exception{
		return ResidentRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
