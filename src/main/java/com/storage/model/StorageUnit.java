package com.storage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "storage_unit")
public class StorageUnit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unit_id")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Boolean getVacant() {
		return vacant;
	}

	public void setVacant(Boolean vacant) {
		this.vacant = vacant;
	}

	@Column(name = "number")
	private String number;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "vacant")
	private Boolean vacant;


}


