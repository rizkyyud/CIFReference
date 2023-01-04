package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.YesornoRepository;
import com.kbbukopin.cif.referrence.cif.model.Yesorno;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class YesornoService {
	private final YesornoRepository YesornoRepository;
	
	public List<Yesorno> getAllData(){
		return YesornoRepository.findAll();
	}
	
	public Yesorno findById(Long id) throws Exception{
		return YesornoRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
