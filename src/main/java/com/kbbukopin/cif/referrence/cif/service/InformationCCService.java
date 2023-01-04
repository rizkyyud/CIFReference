package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.InformationCCRepository;
import com.kbbukopin.cif.referrence.cif.model.InformationCC;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InformationCCService {
	private final InformationCCRepository InformationCCRepository;
	
	public List<InformationCC> getAllData(){
		return InformationCCRepository.findAll();
	}
	
	public InformationCC findById(String id) throws Exception{
		return InformationCCRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
