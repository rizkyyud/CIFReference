package com.kbbukopin.cif.referrence.dukcapil.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.dao.RegencyRepository;
import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegencyService {
	private final RegencyRepository repository;
	
	public List<Regency> findAll(){
		return repository.findAll();
	}
	
	public Regency findById(String id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}
	
	public Provincy getProvincy(String id) throws Exception{
		Regency reg = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		return reg.getProvincy();
	}
	
	public Set<District> getDistrict(String id) throws Exception {
		Regency reg = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		return reg.getDistricts();
	}
}
