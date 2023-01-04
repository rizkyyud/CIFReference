package com.kbbukopin.cif.referrence.cif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.OwnershipType;

@Repository
public interface OwnershipTypeRepository extends JpaRepository<OwnershipType, Long>{

}