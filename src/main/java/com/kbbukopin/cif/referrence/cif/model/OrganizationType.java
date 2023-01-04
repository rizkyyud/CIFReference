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
@Table(name = "organization_type")
@Getter
@Setter
public class OrganizationType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "org_code")
	private Long orgCode;
	
	@Column(name = "org_nm")
	private String orgName;
}
