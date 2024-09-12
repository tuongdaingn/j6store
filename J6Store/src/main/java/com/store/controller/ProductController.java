package com.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.entity.Products;
import com.store.service.IProductService;

@Controller
public class ProductController {
	@Autowired 
	IProductService productService;
	
	@RequestMapping("/product/list")
	public String list(Model model,@RequestParam("cid") Optional<String> cid) {
		if(cid.isPresent()) {
			List<Products> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		}else {
			List<Products> list = productService.findAll();
			model.addAttribute("items", list);
		}
		
		return "product/list";
	}
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model,@PathVariable("id") Integer id ) {
		Products item = productService.findById(id);
		model.addAttribute("item", item);
		return "product/detail";
	}
}
