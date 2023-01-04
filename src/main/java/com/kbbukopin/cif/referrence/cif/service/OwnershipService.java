package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OwnershipRepository;
import com.kbbukopin.cif.referrence.cif.model.Ownership;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OwnershipService {
	private final OwnershipRepository OwnershipRepository;
	
	public List<Ownership> getAllData(){
		return OwnershipRepository.findAll();
	}
	
	public Ownership findById(Long id) throws Exception{
		return OwnershipRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
