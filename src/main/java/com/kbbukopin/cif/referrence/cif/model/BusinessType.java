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
@Table(name = "business_type")
@Getter
@Setter
public class BusinessType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "business_code")
	private Long businessCode;
	
	@Column(name = "business_nm")
	private String businessName;
}
