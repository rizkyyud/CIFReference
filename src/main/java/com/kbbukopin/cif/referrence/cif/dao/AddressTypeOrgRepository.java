package com.kbbukopin.cif.referrence.cif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kbbukopin.cif.referrence.cif.model.AddressTypeOrg;

@Repository
public interface AddressTypeOrgRepository extends JpaRepository<AddressTypeOrg, Long>{

}
