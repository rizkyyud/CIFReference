package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OwnershipTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.OwnershipType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OwnershipTypeService {
	private final OwnershipTypeRepository OwnershipTypeRepository;
	
	public List<OwnershipType> getAllData(){
		return OwnershipTypeRepository.findAll();
	}
	
	public OwnershipType findById(Long id) throws Exception{
		return OwnershipTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
