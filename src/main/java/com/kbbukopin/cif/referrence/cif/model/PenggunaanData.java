package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "penggunaan_data")
@Getter
@Setter
public class PenggunaanData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pendata_cd")
	private Long pendataCode;
	
	@Column(name = "pendata_nm")
	private String pendataName;
}
