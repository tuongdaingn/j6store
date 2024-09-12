package com.store.service;

import java.util.List;

import com.store.entity.Authorities;

public interface IAuthorityService {

	public List<Authorities> findAuthoritiesOfAdministrators();
	
	public List<Authorities> findAll();
	
	public void delete(Integer id);
	
	public Authorities create(Authorities auth);
}
