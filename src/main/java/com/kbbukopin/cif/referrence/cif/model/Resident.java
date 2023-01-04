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
@Table(name = "resident")
@Getter
@Setter
public class Resident {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resident_cd")
	private Long residentCode;
	
	@Column(name = "resident_nm")
	private String residentName;
}
