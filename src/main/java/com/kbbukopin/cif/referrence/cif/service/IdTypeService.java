package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.IdTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.IdType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IdTypeService {
	private final IdTypeRepository IdTypeRepository;
	
	public List<IdType> getAllData(){
		return IdTypeRepository.findAll();
	}
	
	public IdType findById(Long id) throws Exception{
		return IdTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
