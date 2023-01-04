package com.kbbukopin.cif.referrence.dukcapil.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;

@Repository
public interface ProvincyRepository extends JpaRepository<Provincy, String>{
	
	//get provinsi bukidesk by name
	@Query("Select p FROM Provinsi p WHERE p.provName = ?1")
	List<Provinsi> getByName(String nameProv);

}
