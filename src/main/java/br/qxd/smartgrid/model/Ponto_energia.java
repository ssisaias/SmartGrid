package br.qxd.smartgrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ponto_energia {
	
	@Id
	private String nome;
	
	@Column
	private float watts;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getWatts() {
		return watts;
	}

	public void setWatts(float watts) {
		this.watts = watts;
	}
	
	
	

}
