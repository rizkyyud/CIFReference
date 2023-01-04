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
@Table(name = "address_type_org")
@Getter
@Setter
@NoArgsConstructor
public class AddressTypeOrg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addr_code")
	private Long addrCode;
	
	@Column(name = "addr_nm")
	private String addrName;
}
