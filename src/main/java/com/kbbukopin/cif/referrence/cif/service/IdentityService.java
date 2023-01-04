package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.IdentityRepository;
import com.kbbukopin.cif.referrence.cif.model.Identitas;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IdentityService {
	private final IdentityRepository IdentityRepository;
	
	public List<Identitas> getAllData(){
		return IdentityRepository.findAll();
	}
	
	public Identitas findById(Long id) throws Exception{
		return IdentityRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
