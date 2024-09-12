package com.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Accounts;
import com.store.entity.Authorities;
import com.store.repository.AccountRepository;
import com.store.repository.AuthorityRepository;
import com.store.service.IAuthorityService;

@Service
public class AuthorityServiceImpl implements IAuthorityService {
	@Autowired
	AuthorityRepository authorityRepository;
	@Autowired
	AccountRepository accountRepository;
	
	public List<Authorities> findAll(){
		return authorityRepository.findAll();
	}
	
	public Authorities create(Authorities auth) {
		return authorityRepository.save(auth);
	}
	public void delete(Integer id) {
		authorityRepository.deleteById(id);
	}
	@Override
	public List<Authorities> findAuthoritiesOfAdministrators() {
		List<Accounts> accounts = accountRepository.getAdministrators();
		return authorityRepository.authoritiesOf(accounts);
	}
}
