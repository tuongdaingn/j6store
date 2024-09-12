package com.store.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.entity.Order;
import com.store.entity.OrderDetail;
import com.store.repository.OrderDetailRepository;
import com.store.repository.OrderRepository;
import com.store.service.IOrderService;
@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	OrderRepository oRepository;
	
	@Autowired
	OrderDetailRepository oDRepository;

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		Order order = mapper.convertValue(orderData	,Order.class);
		oRepository.save(order);
		
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		oDRepository.saveAll(details);
		return order;
	}

	@Override
	public Object findById(Long id) {
		
		return oRepository.findById(id).get();
	}

	@Override
	public List<Order> findByUsername(String username) {
		return oRepository.findByUsername(username);
	}
	
}
