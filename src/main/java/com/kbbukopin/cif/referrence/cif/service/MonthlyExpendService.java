package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.MonthlyExpendRepository;
import com.kbbukopin.cif.referrence.cif.model.MonthlyExpend;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MonthlyExpendService {
	private final MonthlyExpendRepository MonthlyExpendRepository;
	
	public List<MonthlyExpend> getAllData(){
		return MonthlyExpendRepository.findAll();
	}
	
	public MonthlyExpend findById(Long id) throws Exception{
		return MonthlyExpendRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
