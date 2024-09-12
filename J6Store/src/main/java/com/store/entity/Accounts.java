package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity 
@Table(name="accounts")
public class Accounts implements Serializable{
	@Id
	String username;
	@Column
	String password;
	@Column
	String fullname;
	@Column
	String email;
	@Column
	String photo;
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;
	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authorities> authorities;
	public Accounts() {
		super();
	}
	public Accounts(String username, String password, String fullname, String email, String photo, List<Order> orders,
			List<Authorities> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.photo = photo;
		this.orders = orders;
		this.authorities = authorities;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<Authorities> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<Authorities> authorities) {
		this.authorities = authorities;
	}
	
}
