package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.HobbyRepository;
import com.kbbukopin.cif.referrence.cif.model.Hobby;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HobbyService {
	private final HobbyRepository HobbyRepository;
	
	public List<Hobby> getAllData(){
		return HobbyRepository.findAll();
	}
	
	public Hobby findById(Long id) throws Exception{
		return HobbyRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
