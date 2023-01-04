package com.kbbukopin.cif.referrence.dukcapil.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kbbukopin.cif.referrence.config.NotFoundException;
import com.kbbukopin.cif.referrence.dukcapil.dao.DistrictRepository;
import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Regency;
import com.kbbukopin.cif.referrence.dukcapil.model.Village;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DistrictService {
	private final DistrictRepository repository;
	
	public District findById(String id) throws NotFoundException {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}
	
	@Transactional
	public Set<Village> getVillages(String id) throws NotFoundException {
//		District district = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		Set<Village> nativeGetVillageByDistrictId = repository.nativeGetVillageByDistrictId(id);
		return nativeGetVillageByDistrictId;
	}
	
	public Regency getRegency(String id) throws NotFoundException {
		District district = repository.findById(id).orElseThrow(() -> new NotFoundException(id));
		return district.getRegency();
	}
}
