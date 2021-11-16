package com.tqi.developer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="municipio")
public class City {
	
	@Column(name = "Id")
	@Id
	private Long id;
	
	@Column(name = "Codigo")
	private Integer codigo;
	
	@Column(name="Nome")
	private String name;
	
	@Column
	private String uf;
	
	public City () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
