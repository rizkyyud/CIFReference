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
@Table(name = "resiko_nasabah")
@Getter
@Setter
public class ResikoNasabah {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "risk_cd")
	private Long riskCode;
	
	@Column(name = "risk_nm")
	private String riskName;
}
