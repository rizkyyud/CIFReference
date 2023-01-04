package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ContactNoCcRepository;
import com.kbbukopin.cif.referrence.cif.model.ContactNoCc;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContactNoCcService {
	private final ContactNoCcRepository contactNoCcRepository;
	
	public List<ContactNoCc> getAllData(){
		return contactNoCcRepository.findAll();
	}
	
	public ContactNoCc findById(String id) throws Exception{
		return contactNoCcRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
