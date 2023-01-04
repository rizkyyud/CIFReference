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
@Table(name = "customer_type")
@Getter
@Setter
public class CustomerType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_code")
	private Long cusCode;
	
	@Column(name = "cust_nm")
	private String cusName;
	
	@Column(name = "cust_code2")
	private String cusCode2;
}
