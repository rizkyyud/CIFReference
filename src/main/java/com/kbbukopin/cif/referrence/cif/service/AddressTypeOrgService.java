package com.kbbukopin.cif.referrence.cif.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.dao.AddressTypeOrgRepository;
import com.kbbukopin.cif.referrence.cif.model.AddressTypeOrg;
import com.kbbukopin.cif.referrence.config.NotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AddressTypeOrgService {
	private final AddressTypeOrgRepository repository;

	public List<AddressTypeOrg> getAllData() {
		return repository.findAll();
	}

	public AddressTypeOrg findById(Long id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}
}
