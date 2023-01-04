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
@Table(name = "provinces")
@Getter
@Setter
public class Provinces {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provinces_cd")
	private Long provincesCode;
	
	@Column(name = "provinces_nm")
	private String provincesName;
}
