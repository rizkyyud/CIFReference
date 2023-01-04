package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address_mst_village")
@Getter
@Setter
public class AddressMstVillage {
	@Id
	@Column(name = "village_code")
	private String villageCode;
	
	@Column(name = "district_code")
	private String districtCode;
	
	@Column(name = "village_name")
	private String villageName;
}
