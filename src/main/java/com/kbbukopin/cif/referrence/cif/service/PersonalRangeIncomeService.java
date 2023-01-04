package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PersonalRangeIncomeRepository;
import com.kbbukopin.cif.referrence.cif.model.PersonalRangeIncome;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonalRangeIncomeService {
	private final PersonalRangeIncomeRepository PersonalRangeIncomeRepository;
	
	public List<PersonalRangeIncome> getAllData(){
		return PersonalRangeIncomeRepository.findAll();
	}
	
	public PersonalRangeIncome findById(Long id) throws Exception{
		return PersonalRangeIncomeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
