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
@Table(name = "marital_status")
@Getter
@Setter
public class MartialStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "marital_code")
	private Long maritalCode;
	
	@Column(name = "marital_nm")
	private String maritalName;
}
