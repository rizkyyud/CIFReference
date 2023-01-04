package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AssetClassRepository;
import com.kbbukopin.cif.referrence.cif.model.AssetClass;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AssetClassService {
	private final AssetClassRepository AssetClassRepository;
	
	public List<AssetClass> getAllData(){
		return AssetClassRepository.findAll();
	}
	
	public AssetClass findById(String id) throws Exception{
		return AssetClassRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
	
	public List<AssetClass> findByClassType(String classType){
		return AssetClassRepository.findByClassType(classType);
	}
}
