package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "provinsi")
@Getter
@Setter
public class Provinsi {
	@Id
	@Column(name = "prov_code")
	private String provCode;
	
	@Column(name = "prov_nm")
	private String provName;
}
