package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OccasionCCRepository;
import com.kbbukopin.cif.referrence.cif.model.OccasionCC;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OccasionCCService {
	private final OccasionCCRepository OccasionCCRepository;
	
	public List<OccasionCC> getAllData(){
		return OccasionCCRepository.findAll();
	}
	
	public OccasionCC findById(String id) throws Exception{
		return OccasionCCRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
