package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.NationalityRepository;
import com.kbbukopin.cif.referrence.cif.model.Nationality;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NationalityService {
	private final NationalityRepository NationalityRepository;
	
	public List<Nationality> getAllData(){
		return NationalityRepository.findAll();
	}
	
	public Nationality findById(Long id) throws Exception{
		return NationalityRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
