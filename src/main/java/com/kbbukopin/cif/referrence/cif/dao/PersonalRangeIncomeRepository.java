package com.kbbukopin.cif.referrence.cif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.PersonalRangeIncome;

@Repository
public interface PersonalRangeIncomeRepository extends JpaRepository<PersonalRangeIncome, Long>{

}