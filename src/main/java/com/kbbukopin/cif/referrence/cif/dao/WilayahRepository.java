package com.kbbukopin.cif.referrence.cif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.Wilayah;

@Repository
public interface WilayahRepository extends JpaRepository<Wilayah, String>{

	List<Wilayah> findByProvCode(String provCode);

}