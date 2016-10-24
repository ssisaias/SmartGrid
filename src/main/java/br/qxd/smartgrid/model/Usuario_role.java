package br.qxd.smartgrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario_role {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nome = "USER";

}
