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
@Table(name = "reason_create_account")
@Getter
@Setter
public class ReasonCreateAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reason_code")
	private Long reasonCode;
	
	@Column(name = "reason_name")
	private String reasonName;
}
