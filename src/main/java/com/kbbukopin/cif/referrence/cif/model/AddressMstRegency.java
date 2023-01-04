package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address_mst_regency")
@Getter
@Setter
public class AddressMstRegency {
	@Id
	@Column(name = "regency_code")
	private String regenCode;
	
	@Column(name = "province_code")
	private String provinceCode;
	
	@Column(name = "regency_name")
	private String regencyName;
}
