package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AddressTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.AddressType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressTypeService {
	private final AddressTypeRepository repository;
	
	public List<AddressType> getAllData(){
		return repository.findAll();
	}
	
	public AddressType findById(Long id) throws Exception{
		return repository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
