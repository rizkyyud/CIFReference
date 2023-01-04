package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.EntitasTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.EntitasType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EntitasTypeService {
	private final EntitasTypeRepository EntitasTypeRepository;
	
	public List<EntitasType> getAllData(){
		return EntitasTypeRepository.findAll();
	}
	
	public EntitasType findById(Long id) throws Exception{
		return EntitasTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
