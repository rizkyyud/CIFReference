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
@Table(name = "hobby")
@Getter
@Setter
public class Hobby {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hobby_code")
	private Long hobbyCode;
	
	@Column(name = "hobby_nm")
	private String hobbyName;
}
