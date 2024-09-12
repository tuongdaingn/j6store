package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	@Query("SELECT o From Order o WHERE o.account.username =?1")
	List<Order> findByUsername(String username);

}
