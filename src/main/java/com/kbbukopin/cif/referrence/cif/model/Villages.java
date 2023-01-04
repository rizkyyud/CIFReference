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
@Table(name = "villages")
@Getter
@Setter
public class Villages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "villages_cd")
	private Long villagesCode;
	
	@Column(name = "regions_cd")
	private String regCode;
	
	@Column(name = "villages_nm")
	private String villagesName;
}
