package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.EmployerTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.EmployerType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployerTypeService {
	private final EmployerTypeRepository EmployerTypeRepository;
	
	public List<EmployerType> getAllData(){
		return EmployerTypeRepository.findAll();
	}
	
	public EmployerType findById(String id) throws Exception{
		return EmployerTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
