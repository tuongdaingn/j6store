package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{

}
