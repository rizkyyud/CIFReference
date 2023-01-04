package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OpenrekTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.OpenRekType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OpenRekTypeService {
	private final OpenrekTypeRepository OpenrekTypeRepository;
	
	public List<OpenRekType> getAllData(){
		return OpenrekTypeRepository.findAll();
	}
	
	public OpenRekType findById(Long id) throws Exception{
		return OpenrekTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
