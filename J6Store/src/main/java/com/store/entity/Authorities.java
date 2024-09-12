package com.store.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "Username", "Roleid" }) })
public class Authorities{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne 
	@JoinColumn(name = "Username")
	private Accounts account;
	@ManyToOne  
	@JoinColumn(name = "Roleid")
	private Roles role;
	public Authorities() {
		super();
	}
	public Authorities(Integer id, Accounts account, Roles role) {
		super();
		this.id = id;
		this.account = account;
		this.role = role;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Accounts getAccount() {
		return account;
	}
	public void setAccount(Accounts account) {
		this.account = account;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	
}
