package com.kbbukopin.cif.referrence.cif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.MonthlyExpend;

@Repository
public interface MonthlyExpendRepository extends JpaRepository<MonthlyExpend, Long>{

}