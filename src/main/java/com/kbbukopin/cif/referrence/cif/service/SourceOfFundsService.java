package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.SourceOfFundsRepository;
import com.kbbukopin.cif.referrence.cif.model.SourceOfFunds;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SourceOfFundsService {
	private final SourceOfFundsRepository SourceOfFundsRepository;
	
	public List<SourceOfFunds> getAllData(){
		return SourceOfFundsRepository.findAll();
	}
	
	public SourceOfFunds findById(Long id) throws Exception{
		return SourceOfFundsRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
