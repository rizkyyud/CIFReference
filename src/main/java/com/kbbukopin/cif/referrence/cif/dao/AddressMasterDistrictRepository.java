package com.kbbukopin.cif.referrence.cif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.AddressMstDistrict;

@Repository
public interface AddressMasterDistrictRepository extends JpaRepository<AddressMstDistrict, String>{
	List<AddressMstDistrict> findByRegencyCode(String regencyCode);

}
