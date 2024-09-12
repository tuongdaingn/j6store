package com.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Roles {
	
	@Id
	private String id;
	@Column
	private String name;
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	List<Authorities> authorities;
	public Roles(String id, String name, List<Authorities> authorities) {
		super();
		this.id = id;
		this.name = name;
		this.authorities = authorities;
	}
	public Roles() {
		super();
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
	public List<Authorities> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<Authorities> authorities) {
		this.authorities = authorities;
	}
	
	
}
