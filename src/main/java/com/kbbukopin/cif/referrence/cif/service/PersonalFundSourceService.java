package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PersonalFundSourceRepository;
import com.kbbukopin.cif.referrence.cif.model.PersonalFundSource;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonalFundSourceService {
	private final PersonalFundSourceRepository PersonalFundSourceRepository;
	
	public List<PersonalFundSource> getAllData(){
		return PersonalFundSourceRepository.findAll();
	}
	
	public PersonalFundSource findById(Long id) throws Exception{
		return PersonalFundSourceRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
