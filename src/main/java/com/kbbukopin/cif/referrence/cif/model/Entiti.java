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
@Table(name = "entity")
@Getter
@Setter
public class Entiti {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_cd")
	private Long entityCode;
	
	@Column(name = "entity_nm")
	private String entityName;
}
