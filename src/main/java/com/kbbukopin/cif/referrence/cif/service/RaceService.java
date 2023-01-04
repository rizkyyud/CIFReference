package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.RaceRepository;
import com.kbbukopin.cif.referrence.cif.model.Race;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RaceService {
	private final RaceRepository RaceRepository;
	
	public List<Race> getAllData(){
		return RaceRepository.findAll();
	}
	
	public Race findById(String id) throws Exception{
		return RaceRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
