package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.RelationshipRepository;
import com.kbbukopin.cif.referrence.cif.model.Relationship;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RelationshipService {
	private final RelationshipRepository RelationshipRepository;
	
	public List<Relationship> getAllData(){
		return RelationshipRepository.findAll();
	}
	
	public Relationship findById(Long id) throws Exception{
		return RelationshipRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
