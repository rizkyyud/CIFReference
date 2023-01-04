package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wilayah")
@Getter
@Setter
public class Wilayah {
	@Id
	@Column(name = "wil_code")
	private String wilCode;
	
	@Column(name = "wil_nm")
	private String wilName;
	
	@Column(name = "prov_code")
	private String provCode;
}
