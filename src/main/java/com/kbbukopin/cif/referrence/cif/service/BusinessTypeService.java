package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.BusinessTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.BusinessType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BusinessTypeService {
	private final BusinessTypeRepository businessTypeRepository;
	
	public List<BusinessType> getAllData(){
		return businessTypeRepository.findAll();
	}
	
	public BusinessType findById(Long id) throws Exception{
		return businessTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
