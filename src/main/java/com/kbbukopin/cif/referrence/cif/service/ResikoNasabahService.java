package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ResikoNasabahRepository;
import com.kbbukopin.cif.referrence.cif.model.ResikoNasabah;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResikoNasabahService {
	private final ResikoNasabahRepository ResikoNasabahRepository;
	
	public List<ResikoNasabah> getAllData(){
		return ResikoNasabahRepository.findAll();
	}
	
	public ResikoNasabah findById(Long id) throws Exception{
		return ResikoNasabahRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
