package br.qxd.smartgrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pontos_energia {
	
	@Id
	private String nome;
	
	@Column
	private float watts;
	

}
