package com.store.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity 
@Table(name = "Orderdetails")
public class OrderDetail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	Double price;
	@Column
	Integer quantity;
	@ManyToOne
	@JoinColumn(name = "Productid")
	Products product;
	@ManyToOne
	@JoinColumn(name = "Orderid")
	Order order;
	public OrderDetail() {
		super();
	}
	public OrderDetail(Long id, Double price, Integer quantity, Products product, Order order) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.product = product;
		this.order = order;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
