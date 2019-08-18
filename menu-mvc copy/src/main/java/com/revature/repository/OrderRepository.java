package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findbyPrice(double price);

}
