package com.kbbukopin.cif.referrence.cif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.AddressMstVillage;

@Repository
public interface AddressMasterVillageRepository extends JpaRepository<AddressMstVillage, String>{

	List<AddressMstVillage> findByDistrictCode(String districtCode);

}
