package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.Range50jt100mRepository;
import com.kbbukopin.cif.referrence.cif.model.Range50jt100m;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Range50jt100mService {
	private final Range50jt100mRepository Range50jt100mRepository;
	
	public List<Range50jt100m> getAllData(){
		return Range50jt100mRepository.findAll();
	}
	
	public Range50jt100m findById(Long id) throws Exception{
		return Range50jt100mRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
