package com.store.service;

import java.util.List;

import com.store.entity.Products;

public interface IProductService {
	List<Products> findAll();
	Products findById(Integer id);
	List<Products> findByCategoryId(String cid);
	Products create(Products product);
	Products update(Products product);
	void delete(Integer id);
}
