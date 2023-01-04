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
@Table(name = "title")
@Getter
@Setter
public class Title {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_cd")
	private Long titleCode;
	
	@Column(name = "title_nm")
	private String titleName;
}
