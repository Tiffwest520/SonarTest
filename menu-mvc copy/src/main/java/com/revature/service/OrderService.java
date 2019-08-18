package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Order;
import com.revature.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	OrderRepository dao; 
	
	
	public Order add (Order orders) {
		return dao.save(orders);
	}
	
	public List<Order> getAll(){
		return dao.findAll();
	}
	
	
	public List<Order> getByPrice(double price){
		return dao.findbyPrice(price);
	}
	/*
	private static List<Order> orders = new ArrayList<Order>();
	private static int lastId = 2;
	
	static {
		orders.add(new Order(1,"sandwich", 2.0));
		orders.add(new Order(2, "cheesecake", 3.5));
	}
	
	
	public List<Order> getAll(){
		return orders;
	}
	
	
	
	public Order save(Order o) {
		o.setId(++lastId);
		orders.add(o);
		return o;
		*/
	}

