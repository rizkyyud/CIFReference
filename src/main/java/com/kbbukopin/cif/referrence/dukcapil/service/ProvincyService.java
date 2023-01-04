package com.kbbukopin.cif.referrence.dukcapil.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.cif.service.ProvinsiService;
import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.dao.ProvincyRepository;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProvincyService {
	private final ProvincyRepository repository;
	private final ProvinsiService servProvinsi;

	public List<Provincy> getAll() {
		return repository.findAll();
	}

	public Provincy findById(String id) throws Exception {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}

	public Set<Regency> getAllRegency(String id) throws Exception {
		Provincy prov = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		return prov.getRegencies();
	}

	@Transactional
	public Provinsi getProvinsiByProvId(String nameProv) throws Exception{ 
		List<Provinsi> byName = repository.getByName(nameProv);
		if (byName.size() != 0) {
			return byName.get(0);
		} else {
			return servProvinsi.findById("999");
		}
	}
}
