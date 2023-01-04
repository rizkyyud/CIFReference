package com.kbbukopin.cif.referrence.cif.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "log")
@Getter
@Setter
public class Log {
	@Id
	@Column(name = "log_cd")
	private String logCode;
	
	@Column(name = "log_nm")
	private String logName;
}
