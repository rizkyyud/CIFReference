package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OwnerTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.OwnerType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OwnerTypeService {
	private final OwnerTypeRepository OwnerTypeRepository;
	
	public List<OwnerType> getAllData(){
		return OwnerTypeRepository.findAll();
	}
	
	public OwnerType findById(String id) throws Exception{
		return OwnerTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
