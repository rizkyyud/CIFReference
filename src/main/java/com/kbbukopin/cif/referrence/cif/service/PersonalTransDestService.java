package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PersonalTransDestRepository;
import com.kbbukopin.cif.referrence.cif.model.PersonalTransDest;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonalTransDestService {
	private final PersonalTransDestRepository PersonalTransDestRepository;
	
	public List<PersonalTransDest> getAllData(){
		return PersonalTransDestRepository.findAll();
	}
	
	public PersonalTransDest findById(Long id) throws Exception{
		return PersonalTransDestRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
