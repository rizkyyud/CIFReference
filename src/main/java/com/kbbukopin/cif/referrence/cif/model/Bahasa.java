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
@Table(name = "bahasa")
@Getter
@Setter
public class Bahasa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bahasa_cd")
	private String bahasaCode;
	
	@Column(name = "bahasa_nm")
	private String bahasaName;
}
