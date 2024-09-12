package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.store.entity.Products;

public interface ProductRepository extends JpaRepository<Products,Integer>{
	@Query("SELECT p FROM Products p WHERE p.category.id=?1")
	List<Products> findByCategoryId(String cid);

}
