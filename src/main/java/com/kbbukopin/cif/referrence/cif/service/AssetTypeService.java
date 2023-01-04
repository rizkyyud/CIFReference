package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AssetTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.AssetType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AssetTypeService {
	private final AssetTypeRepository assetTypeRepository;
	
	public List<AssetType> getAllData(){
		return assetTypeRepository.findAll();
	}
	
	public AssetType findById(Long id) throws Exception{
		return assetTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
