package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.GenderRepository;
import com.kbbukopin.cif.referrence.cif.model.Gender;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GenderService {
	private final GenderRepository GenderRepository;
	
	public List<Gender> getAllData(){
		return GenderRepository.findAll();
	}
	
	public Gender findById(Long id) throws Exception{
		return GenderRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
