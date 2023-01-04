package com.kbbukopin.cif.referrence.dukcapil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.dukcapil.model.Village;

@Repository
public interface VillageRepository extends JpaRepository<Village, String>{
	
}
