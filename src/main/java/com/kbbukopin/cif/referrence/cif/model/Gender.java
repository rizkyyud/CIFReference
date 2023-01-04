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
@Table(name = "gender")
@Getter
@Setter
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gender_id")
	private Long genderId;
	
	@Column(name = "gender_name")
	private String genderName;
}
