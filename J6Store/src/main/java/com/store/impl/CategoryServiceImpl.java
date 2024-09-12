package com.store.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.entity.Category;
import com.store.repository.CategoryRepository;
import com.store.service.ICategoryService;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
