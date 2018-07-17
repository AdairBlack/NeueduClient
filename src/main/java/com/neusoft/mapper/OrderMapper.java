package com.neusoft.mapper;

import java.util.List;

import com.neusoft.bean.Order;

public interface OrderMapper {
	public List<Order> findAllOrder(int qid) throws Exception;

	public List<Order> findPartOrder(String condition1, String condition2, int qid) throws Exception;

	public Order findOrderById(int oid) throws Exception;

	public void refund(int oid) throws Exception;

}
