package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PenggunaanDataRepository;
import com.kbbukopin.cif.referrence.cif.model.PenggunaanData;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PenggunaanDataService {
	private final PenggunaanDataRepository PenggunaanDataRepository;
	
	public List<PenggunaanData> getAllData(){
		return PenggunaanDataRepository.findAll();
	}
	
	public PenggunaanData findById(Long id) throws Exception{
		return PenggunaanDataRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
