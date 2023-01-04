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
@Table(name = "information_cc")
@Getter
@Setter
public class InformationCC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "info_code")
	private String infoCode;
	
	@Column(name = "info_desc")
	private String infoDesc;
}
