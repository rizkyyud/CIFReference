package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.PurposeOpeningAccountRepository;
import com.kbbukopin.cif.referrence.cif.model.PurposeOpeningAccount;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PurposeOpeningAccountService {
	private final PurposeOpeningAccountRepository PurposeOpeningAccountRepository;
	
	public List<PurposeOpeningAccount> getAllData(){
		return PurposeOpeningAccountRepository.findAll();
	}
	
	public PurposeOpeningAccount findById(Long id) throws Exception{
		return PurposeOpeningAccountRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
