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
@Table(name = "religion")
@Getter
@Setter
public class Religion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "religion_code")
	private Long religionCode;
	
	@Column(name = "religion_nm")
	private String religionName;
}
