package com.kbbukopin.cif.referrence.dukcapil.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "duk_regencies")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Regency {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
		
	@ManyToOne
	@JoinColumn(name = "province_id", nullable = false)
	private Provincy provincy;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "regency")
	private Set<District> districts;
}
