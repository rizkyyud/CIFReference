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
@Table(name = "occ_type")
@Getter
@Setter
public class OccType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "occtype_cd")
	private Long occTypeCode;
	
	@Column(name = "occtype_nm")
	private String occTypeName;
}
