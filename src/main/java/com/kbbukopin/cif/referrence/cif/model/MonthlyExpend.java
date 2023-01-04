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
@Table(name = "monthly_expend")
@Getter
@Setter
public class MonthlyExpend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "range_code")
	private Long rangeCode;
	
	@Column(name = "range_name")
	private String rangeName;
}
