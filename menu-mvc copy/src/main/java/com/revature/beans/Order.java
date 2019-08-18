package com.revature.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Order {
	@Min(value=0)
	private int id;
	
	@NotNull
	@Size(min=5)
	@Pattern(regexp="[a-z-A-Z]*")
	private String order;
	
	@Min(value=0)
	private double price;
	
	
	public Order() {}


	public Order(int id, String order, double price) {
		super();
		this.id = id;
		this.order = order;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", order=" + order + ", price=" + price + "]";
	}
	
	
}
