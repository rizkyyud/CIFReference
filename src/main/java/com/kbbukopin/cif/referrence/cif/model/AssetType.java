package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "asset_type")
@Getter
@Setter
@NoArgsConstructor
public class AssetType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_code")
	private Long assCode;
	
	@Column(name = "asset_nm")
	private String assName;
}
