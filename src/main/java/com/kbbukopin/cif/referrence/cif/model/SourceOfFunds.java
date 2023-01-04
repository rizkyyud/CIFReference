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
@Table(name = "source_of_funds")
@Getter
@Setter
public class SourceOfFunds {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "source_code")
	private Long sourceCode;
	
	@Column(name = "source_name")
	private String sourceName;
}
