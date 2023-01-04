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
@Table(name = "personal_other_source")
@Getter
@Setter
public class PersonalOtherSource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perothrsrc_cd")
	private Long perothrsrcCode;
	
	@Column(name = "perothrsrc_nm")
	private String perothrsrcName;
}
