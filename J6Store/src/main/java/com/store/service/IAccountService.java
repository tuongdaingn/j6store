package com.store.service;

import java.util.List;

import com.store.entity.Accounts;

public interface IAccountService {
	Accounts findById(String username);
	public List<Accounts> getAdministrators();
	public List<Accounts> findAll();
}
