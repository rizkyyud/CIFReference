package com.kbbukopin.cif.referrence.cif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.Provinsi;
import com.kbbukopin.cif.referrence.dukcapil.model.Provincy;

@Repository
public interface ProvinsiRepository extends JpaRepository<Provinsi, String>{
	
	//get provinsi bukidesk by name
		@Query("Select p FROM Provincy p WHERE p.name = ?1")
		List<Provincy> getByName(String nameProv);
}