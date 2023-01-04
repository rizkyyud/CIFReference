package com.kbbukopin.cif.referrence.cif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.PurposeOpeningAccount;

@Repository
public interface PurposeOpeningAccountRepository extends JpaRepository<PurposeOpeningAccount, Long>{

}