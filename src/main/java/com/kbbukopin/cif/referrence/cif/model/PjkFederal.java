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
@Table(name = "pjk_federal")
@Getter
@Setter
public class PjkFederal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pjkfederal_cd")
	private Long pjkfederalCode;
	
	@Column(name = "pjkfederal_nm")
	private String pjkfederalName;
}
