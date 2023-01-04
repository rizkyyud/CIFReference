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
@Table(name = "nationality")
@Getter
@Setter
public class Nationality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nationality_code")
	private Long nationCode;
	
	@Column(name = "nationality_name")
	private String nationName;
}
