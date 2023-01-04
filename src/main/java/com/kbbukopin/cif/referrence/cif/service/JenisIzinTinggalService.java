package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.JenisIzinTinggalRepository;
import com.kbbukopin.cif.referrence.cif.model.JenisIzinTinggal;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JenisIzinTinggalService {
	private final JenisIzinTinggalRepository JenisIzinTinggalRepository;
	
	public List<JenisIzinTinggal> getAllData(){
		return JenisIzinTinggalRepository.findAll();
	}
	
	public JenisIzinTinggal findById(Long id) throws Exception{
		return JenisIzinTinggalRepository
				.findById(id)
				.orElseThrow(()->new NotFoundException(id)); 
	}
}
