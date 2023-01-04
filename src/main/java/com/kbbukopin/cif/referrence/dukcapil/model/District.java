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
@Table(name = "duk_districts")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class District {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "regency_id", nullable = false)
	private Regency regency;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "district")
	private Set<Village> villages;
}
