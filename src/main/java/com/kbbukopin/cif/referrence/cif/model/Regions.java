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
@Table(name = "regions")
@Getter
@Setter
public class Regions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "regions_cd")
	private Long regCode;
	
	@Column(name = "cities_cd")
	private String citiesCode;
	
	@Column(name = "regions_nm")
	private String regName;
}
