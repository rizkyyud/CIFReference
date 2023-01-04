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
@Table(name = "position_risk")
@Getter
@Setter
public class PositionRisk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posrisk_cd")
	private Long pesriskCode;
	
	@Column(name = "posrisk_nm")
	private String posriskName;
}
