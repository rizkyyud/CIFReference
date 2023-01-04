package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.TitleRepository;
import com.kbbukopin.cif.referrence.cif.model.Title;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TitleService {
	private final TitleRepository TitleRepository;
	
	public List<Title> getAllData(){
		return TitleRepository.findAll();
	}
	
	public Title findById(Long id) throws Exception{
		return TitleRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
