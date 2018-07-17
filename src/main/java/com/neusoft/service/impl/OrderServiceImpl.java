package com.neusoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.bean.Order;
import com.neusoft.mapper.OrderMapper;
import com.neusoft.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> findAllOrder(int qid) throws Exception {
		System.out.println("......OrderServiceImpl......findAllOrder()......");
		List<Order> orders = new ArrayList<Order>(); 
		
		orders = orderMapper.findAllOrder(qid);
		
		return orders;
	}

	@Override
	public List<Order> findPartOrder(String condition1, String condition2, int qid) throws Exception {
		System.out.println("......OrderServiceImpl......findPartOrder()......");
		List<Order> orders = new ArrayList<Order>(); 
		
		orders = orderMapper.findPartOrder(condition1, condition2, qid);
		
		return orders;
	}

	@Override
	public Order findOrderById(int oid) throws Exception  {
		System.out.println("......OrderServiceImpl......findOrderById()......");
		Order order = orderMapper.findOrderById(oid);
		
		return order;
	}

	@Override
	public void refund(int oid) throws Exception {
		System.out.println("......OrderServiceImpl......refund()......");
		orderMapper.refund(oid);
		
	}

}
