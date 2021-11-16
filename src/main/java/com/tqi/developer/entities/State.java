package com.tqi.developer.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class State  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(name ="codigoUf")
	private int codigo;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "Uf")
   private String uf;
   
	@Column(name = "regiao")
   private int region;
	
	
	public State ( ){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	
	
	
	
}
