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
@Table(name = "personal_trans_dest")
@Getter
@Setter
public class PersonalTransDest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pertransdest_cd")
	private Long pertransdestCode;
	
	@Column(name = "pertransdest_nm")
	private String pertransdestName;
}
