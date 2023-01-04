package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.SourceFundPdtbuRepository;
import com.kbbukopin.cif.referrence.cif.model.SourceFundPdtbu;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SourceFundPdtbuService {
	private final SourceFundPdtbuRepository SourceFundPdtbuRepository;
	
	public List<SourceFundPdtbu> getAllData(){
		return SourceFundPdtbuRepository.findAll();
	}
	
	public SourceFundPdtbu findById(Long id) throws Exception{
		return SourceFundPdtbuRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
