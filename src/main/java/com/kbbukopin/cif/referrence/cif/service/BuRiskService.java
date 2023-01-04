package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.BuRiskRepository;
import com.kbbukopin.cif.referrence.cif.model.BuRisk;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuRiskService {
	private final BuRiskRepository BuRiskRepository;
	
	public List<BuRisk> getAllData(){
		return BuRiskRepository.findAll();
	}
	
	public BuRisk findById(Long id) throws Exception{
		return BuRiskRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
