package com.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Accounts;
import com.store.repository.AccountRepository;
import com.store.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Accounts findById(String username) {
		return accountRepository.findById(username).get();
	}
	@Override
	public List<Accounts> getAdministrators() {
		return accountRepository.getAdministrators();
	}
	@Override
	public List<Accounts> findAll() {
		return accountRepository.findAll();
	}

}
