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
@Table(name = "occasion_cc")
@Getter
@Setter
public class OccasionCC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "occasion_code")
	private String occasionCode;
	
	@Column(name = "occasion_desc")
	private String occasionDesc;
}
