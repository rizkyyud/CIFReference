package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "[identity]")
@Getter
@Setter
@NoArgsConstructor
public class Identitas {
	@Id
	@Column(name = "identity_code")
	private Long identityCd;
	
	@Column(name = "identity_name")
	private String identityName;
}
