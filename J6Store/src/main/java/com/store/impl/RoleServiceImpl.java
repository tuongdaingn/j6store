package com.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Roles;
import com.store.repository.RoleRepository;
import com.store.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService{
	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public List<Roles> findAll() {
		return roleRepository.findAll();
	}
	
}
