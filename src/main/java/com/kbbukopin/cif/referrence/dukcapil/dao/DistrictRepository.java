package com.kbbukopin.cif.referrence.dukcapil.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.dukcapil.model.District;
import com.kbbukopin.cif.referrence.dukcapil.model.Village;

@Repository
public interface DistrictRepository extends JpaRepository<District, String>{
	@Query("SELECT v FROM Village v WHERE v.district.id = ?1")
	Set<Village> nativeGetVillageByDistrictId(String districtId);
}
