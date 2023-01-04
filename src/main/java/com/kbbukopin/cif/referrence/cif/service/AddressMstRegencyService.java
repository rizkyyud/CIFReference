package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AddressMasterRegencyRepository;
import com.kbbukopin.cif.referrence.cif.model.AddressMstRegency;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressMstRegencyService {
	private final AddressMasterRegencyRepository repository;
	
	public List<AddressMstRegency> getAllData(){
		return repository.findAll();
	}
	
	public AddressMstRegency findById(String id) throws Exception{
		return repository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
