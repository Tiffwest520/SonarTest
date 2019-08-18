package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Order;
import com.revature.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	
	@Autowired
	OrderService service;
	
	@RequestMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = service.getAll();
		if(orders == null || orders.size() == 0) return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> add(@RequestBody Order o){
		o = service.add(o);
		return new ResponseEntity<Order>(o, HttpStatus.CREATED);
	}		
	
	/*
	@Autowired
	OrderService service;
	
	
	@RequestMapping(method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> getAllOrders(){
		return service.getAll();
	}
	
		@RequestMapping(method=RequestMethod.POST, 
				consumes=MediaType.APPLICATION_JSON_VALUE,
				produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Order> save(@RequestBody @Valid Order order){
			//lets assume we will always have 201 status
			order = service.save(order);
			return new ResponseEntity<Order>(order, HttpStatus.CREATED);
		}
		*/

}
