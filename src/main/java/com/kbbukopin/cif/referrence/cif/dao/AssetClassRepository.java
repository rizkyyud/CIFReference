package com.kbbukopin.cif.referrence.cif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.AssetClass;

@Repository
public interface AssetClassRepository extends JpaRepository<AssetClass, String>{
	List<AssetClass> findByClassType(String classType);
}