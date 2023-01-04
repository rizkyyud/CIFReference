package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.LogRepository;
import com.kbbukopin.cif.referrence.cif.model.Log;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LogService {
	private final LogRepository LogRepository;
	
	public List<Log> getAllData(){
		return LogRepository.findAll();
	}
	
	public Log findById(String id) throws Exception{
		return LogRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
