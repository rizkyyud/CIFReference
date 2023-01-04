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
@Table(name = "bu_risk")
@Getter
@Setter
public class BuRisk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "burisk_cd")
	private Long buriskCode;
	
	@Column(name = "burisk_nm")
	private String buriskName;
}
