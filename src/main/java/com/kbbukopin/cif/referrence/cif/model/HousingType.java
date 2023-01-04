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
@Table(name = "housing_type")
@Getter
@Setter
public class HousingType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "house_code")
	private Long houseCode;
	
	@Column(name = "house_nm")
	private String houseName;
}
