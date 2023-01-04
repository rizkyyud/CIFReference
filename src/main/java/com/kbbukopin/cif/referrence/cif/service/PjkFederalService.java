package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PjkFederalRepository;
import com.kbbukopin.cif.referrence.cif.model.PjkFederal;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PjkFederalService {
	private final PjkFederalRepository PjkFederalRepository;
	
	public List<PjkFederal> getAllData(){
		return PjkFederalRepository.findAll();
	}
	
	public PjkFederal findById(Long id) throws Exception{
		return PjkFederalRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
