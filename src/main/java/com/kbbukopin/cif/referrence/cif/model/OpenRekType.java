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
@Table(name = "openrek_type")
@Getter
@Setter
public class OpenRekType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "openrek_cd")
	private Long openRekCode;
	
	@Column(name = "openrek_nm")
	private String openRekName;
}
