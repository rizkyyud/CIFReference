package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.MaritalStatusRepository;
import com.kbbukopin.cif.referrence.cif.model.MaritalStatus;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MaritalStatusService {
	private final MaritalStatusRepository MaritalStatusRepository;
	
	public List<MaritalStatus> getAllData(){
		return MaritalStatusRepository.findAll();
	}
	
	public MaritalStatus findById(Long id) throws Exception{
		return MaritalStatusRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
