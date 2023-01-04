package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OccTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.OccType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OccTypeService {
	private final OccTypeRepository OccTypeRepository;
	
	public List<OccType> getAllData(){
		return OccTypeRepository.findAll();
	}
	
	public OccType findById(Long id) throws Exception{
		return OccTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
