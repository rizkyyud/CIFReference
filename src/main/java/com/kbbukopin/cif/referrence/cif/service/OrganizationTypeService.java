package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OrganizationTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.OrganizationType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrganizationTypeService {
	private final OrganizationTypeRepository OrganizationTypeRepository;
	
	public List<OrganizationType> getAllData(){
		return OrganizationTypeRepository.findAll();
	}
	
	public OrganizationType findById(Long id) throws Exception{
		return OrganizationTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
