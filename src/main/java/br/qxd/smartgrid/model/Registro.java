package br.qxd.smartgrid.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Registro {
	
	@Id
	@GeneratedValue
	private long id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm")
	@Column
	private Timestamp data = new Timestamp(new java.util.Date().getTime());
	
	@Column 
	private float totalWatts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public float getTotalWatts() {
		return totalWatts;
	}

	public void setTotalWatts(float totalWatts) {
		this.totalWatts = totalWatts;
	}
	
	
}
