package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address_mst_district")
@Getter
@Setter
public class AddressMstDistrict {
	@Id
	@Column(name = "district_code")
	private String districtCode;
	
	@Column(name = "regency_code")
	private String regencyCode;
	
	@Column(name = "district_name")
	private String districtName;
}
