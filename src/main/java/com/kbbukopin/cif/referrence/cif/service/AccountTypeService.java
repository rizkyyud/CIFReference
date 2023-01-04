package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AccountTypeRepository;
import com.kbbukopin.cif.referrence.cif.model.AccountType;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountTypeService {
	private final AccountTypeRepository accountTypeRepository;
	
	public List<AccountType> getAllData(){
		return accountTypeRepository.findAll();
	}
	
	public AccountType findById(Long id) throws Exception{
		return accountTypeRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
