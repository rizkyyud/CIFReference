package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PersonalOtherSourceRepository;
import com.kbbukopin.cif.referrence.cif.model.PersonalOtherSource;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonalOtherSourceService {
	private final PersonalOtherSourceRepository PersonalOtherSourceRepository;
	
	public List<PersonalOtherSource> getAllData(){
		return PersonalOtherSourceRepository.findAll();
	}
	
	public PersonalOtherSource findById(Long id) throws Exception{
		return PersonalOtherSourceRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
