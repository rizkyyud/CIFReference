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
@Table(name = "range_salary_month")
@Getter
@Setter
public class RangeSalaryMonth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "range_code")
	private Long RangeCode;
	
	@Column(name = "range_name")
	private String rangeName;
}
