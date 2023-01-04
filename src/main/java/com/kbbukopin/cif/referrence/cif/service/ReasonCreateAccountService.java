package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.ReasonCreateAccountRepository;
import com.kbbukopin.cif.referrence.cif.model.ReasonCreateAccount;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReasonCreateAccountService {
	private final ReasonCreateAccountRepository ReasonCreateAccountRepository;
	
	public List<ReasonCreateAccount> getAllData(){
		return ReasonCreateAccountRepository.findAll();
	}
	
	public ReasonCreateAccount findById(Long id) throws Exception{
		return ReasonCreateAccountRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
