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
	@Column(name = "Id")
	private Integer id;
	
	@Column(name ="CodigoUf")
	private Integer codigo;
	
	@Column(name = "Nome")
	private String name;
	
	@Column(name = "Uf")
   private String uf;
   
	@Column(name = "Regiao")
   private Integer region;
	
	
	public State ( ){
		
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
