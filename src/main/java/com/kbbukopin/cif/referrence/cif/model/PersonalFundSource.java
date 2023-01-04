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
@Table(name = "personal_fund_source")
@Getter
@Setter
public class PersonalFundSource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perfundsrc_cd")
	private Long perfundsrcCode;
	
	@Column(name = "perfundsrc_nm")
	private String perfundsrcName;
}
