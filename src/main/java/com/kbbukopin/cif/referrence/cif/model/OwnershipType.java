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
@Table(name = "ownership_type")
@Getter
@Setter
public class OwnershipType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owntype_cd")
	private Long ownTypeCode;
	
	@Column(name = "owntype_nm")
	private String ownTypeName;
}
