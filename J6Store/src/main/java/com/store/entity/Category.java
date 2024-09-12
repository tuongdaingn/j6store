package com.store.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@SuppressWarnings("serial")
@Table(name = "Categories")
@Entity
public class Category implements Serializable{
	@Id
	String id;
	@Column
	String name;
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	List<Products> products;
	
	public Category() {
		super();
	}
	public Category(String id, String name, List<Products> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
}
