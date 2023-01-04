package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ProvinsiRepository;
import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProvinsiService {
	private final ProvinsiRepository ProvinsiRepository;
	
	public List<Provinsi> getAllData(){
		return ProvinsiRepository.findAll();
	}
	
	public Provinsi findById(String id) throws Exception{
		return ProvinsiRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
	
	@Transactional
	public Provincy getProvinsiByName(String nameProv) throws Exception{ 
		List<Provincy> byName = ProvinsiRepository.getByName(nameProv);
		if (byName.size() != 0) {
			return byName.get(0);
		} 
		else {
			throw new NotFoundException(nameProv);
		}
	}
}
