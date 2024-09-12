package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, String>{
	@Query("SELECT DISTINCT ar.account FROM Authorities ar WHERE ar.role.id IN ('DIRE','STAF')")
	List<Accounts> getAdministrators();

}
