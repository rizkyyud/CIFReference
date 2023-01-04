package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.CustomerTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.CustomerType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerTypeService {
	private final CustomerTypeRepository CustomerTypeRepository;
	
	public List<CustomerType> getAllData(){
		return CustomerTypeRepository.findAll();
	}
	
	public CustomerType findById(Long id) throws Exception{
		return CustomerTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
