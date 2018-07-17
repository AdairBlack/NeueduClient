package com.neusoft.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.bean.Order;
import com.neusoft.service.OrderService;

@Controller
public class OrderHandler {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/order/OrderHandler_findAllOrder")
	@ResponseBody
	public List<Order> findAllOrder(HttpServletRequest request) throws Exception {
		System.out.println("......OrderHandler......findAllOrder()..........");
		List<Order> orders = orderService.findAllOrder(Integer.parseInt(request.getParameter("qid")));
		
		return orders;
		
	}
	
	@RequestMapping(value="/order/OrderHandler_findPartOrder")
	@ResponseBody
	public List<Order> findPartOrder(HttpServletRequest request) throws Exception {
		System.out.println("......OrderHandler......findPartOrder()..........");
		List<Order> orders = orderService.findPartOrder(request.getParameter("condition1"), request.getParameter("condition2"), Integer.parseInt(request.getParameter("qid")));
		
		return orders;
		
	}
	
	@RequestMapping(value="/order/OrderHandler_findOrderById")
	@ResponseBody
	public Order findOrderById(HttpServletRequest request) throws Exception {
		System.out.println("......OrderHandler......findOrderById()..........");
		Order order = orderService.findOrderById(Integer.parseInt(request.getParameter("oid")));
		
		return order;
		
	}
	
	@RequestMapping(value="/order/OrderHandler_refund")
	public void refund(HttpServletRequest request) throws Exception {
		System.out.println("......OrderHandler......refund()..........");
		orderService.refund(Integer.parseInt(request.getParameter("oid")));
				
	}
}
