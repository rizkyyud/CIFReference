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
@Table(name = "jenis_izin_tinggal")
@Getter
@Setter
public class JenisIzinTinggal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "izintinggal_cd")
	private Long izinTinggalCode;
	
	@Column(name = "izintinggal_nm")
	private String izinTinggalName;
}
