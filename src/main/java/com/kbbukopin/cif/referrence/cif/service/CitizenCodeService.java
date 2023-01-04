package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.CitizenCodeRepository;
import com.kbbukopin.cif.referrence.cif.model.CitizenCode;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CitizenCodeService {
	private final CitizenCodeRepository citizenCodeRepository;
	
	public List<CitizenCode> getAllData(){
		return citizenCodeRepository.findAll();
	}
	
	public CitizenCode findById(String id) throws Exception{
		return citizenCodeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
