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
@Table(name = "personal_range_income")
@Getter
@Setter
public class PersonalRangeIncome {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perincome_cd")
	private Long perincomeCode;
	
	@Column(name = "perincome_nm")
	private String perincomeName;
}
