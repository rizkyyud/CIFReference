package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.OptionindisiaRepository;
import com.kbbukopin.cif.referrence.cif.model.Optionindisia;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OptionindisiaService {
	private final OptionindisiaRepository OptionindisiaRepository;
	
	public List<Optionindisia> getAllData(){
		return OptionindisiaRepository.findAll();
	}
	
	public Optionindisia findById(Long id) throws Exception{
		return OptionindisiaRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
