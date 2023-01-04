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
@Table(name = "race")
@Getter
@Setter
public class Race {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "race_cd")
	private String raceCode;
	
	@Column(name = "race_nm")
	private String raceName;
}
