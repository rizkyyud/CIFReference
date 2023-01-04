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
@Table(name = "ownership")
@Getter
@Setter
public class Ownership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "own_cd")
	private Long ownCode;
	
	@Column(name = "own_nm")
	private String ownName;
}
