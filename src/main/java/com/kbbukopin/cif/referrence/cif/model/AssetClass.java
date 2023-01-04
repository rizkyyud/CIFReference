package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "asset_class")
@Getter
@Setter
public class AssetClass {
	@Id
	@Column(name = "class_code")
	private String classCode;
	
	@Column(name = "class_type")
	private String classType;

	@Column(name = "asset_nm")
	private String assetName;
}
