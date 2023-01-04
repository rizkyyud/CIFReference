package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PositionRepository;
import com.kbbukopin.cif.referrence.cif.model.Position;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PositionService {
	private final PositionRepository PositionRepository;
	
	public List<Position> getAllData(){
		return PositionRepository.findAll();
	}
	
	public Position findById(Long id) throws Exception{
		return PositionRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
