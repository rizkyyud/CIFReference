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
@Table(name = "relationship")
@Getter
@Setter
public class Relationship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rel_code")
	private Long relCode;
	
	@Column(name = "rel_nm")
	private String relName;
}
