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
@Table(name = "familiar_bkp")
@Getter
@Setter
public class FamiliarBKP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "familiarbkp_cd")
	private Long famBkpCode;
	
	@Column(name = "familiarbkp_nm")
	private String famBkpName;
}
