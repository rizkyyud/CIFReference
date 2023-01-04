package com.kbbukopin.cif.referrence.dukcapil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.dukcapil.model.Regency;

@Repository
public interface RegencyRepository extends JpaRepository<Regency, String>{

}
