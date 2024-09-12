package com.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Products;
import com.store.repository.ProductRepository;
import com.store.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	ProductRepository productRepository;
	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	@Override
	public Products findById(Integer id) {
		return productRepository.findById(id).get();
	}
	@Override
	public List<Products> findByCategoryId(String cid) {
		return productRepository.findByCategoryId(cid);
	}
	@Override
	public Products create(Products product) {
		return productRepository.save(product);
	}
	@Override
	public Products update(Products product) {
		return productRepository.save(product);
	}
	@Override
	public void delete(Integer id) {
		productRepository.deleteById(id);
	}

}
