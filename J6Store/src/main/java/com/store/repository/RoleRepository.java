package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, String>{

}
