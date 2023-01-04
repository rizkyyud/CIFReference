package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PositionRiskRepository;
import com.kbbukopin.cif.referrence.cif.model.PositionRisk;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PositionRiskService {
	private final PositionRiskRepository PositionRiskRepository;
	
	public List<PositionRisk> getAllData(){
		return PositionRiskRepository.findAll();
	}
	
	public PositionRisk findById(Long id) throws Exception{
		return PositionRiskRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
