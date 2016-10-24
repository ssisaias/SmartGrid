package br.qxd.smartgrid.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registro {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private Timestamp data = new Timestamp(new java.util.Date().getTime());
	
	@Column 
	private float totalWatts;

}
