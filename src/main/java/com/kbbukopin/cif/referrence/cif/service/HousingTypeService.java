package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.HousingTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.HousingType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HousingTypeService {
	private final HousingTypeRepository HousingTypeRepository;
	
	public List<HousingType> getAllData(){
		return HousingTypeRepository.findAll();
	}
	
	public HousingType findById(Long id) throws Exception{
		return HousingTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
