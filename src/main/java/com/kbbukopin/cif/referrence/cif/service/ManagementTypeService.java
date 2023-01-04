package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ManagementTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.ManagementType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ManagementTypeService {
	private final ManagementTypeRepository ManagementTypeRepository;
	
	public List<ManagementType> getAllData(){
		return ManagementTypeRepository.findAll();
	}
	
	public ManagementType findById(String id) throws Exception{
		return ManagementTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
