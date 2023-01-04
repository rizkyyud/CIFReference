package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.RangeSalaryMonthRepository;
import com.kbbukopin.cif.referrence.cif.model.RangeSalaryMonth;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RangeSalaryMonthService {
	private final RangeSalaryMonthRepository RangeSalaryMonthRepository;
	
	public List<RangeSalaryMonth> getAllData(){
		return RangeSalaryMonthRepository.findAll();
	}
	
	public RangeSalaryMonth findById(Long id) throws Exception{
		return RangeSalaryMonthRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
