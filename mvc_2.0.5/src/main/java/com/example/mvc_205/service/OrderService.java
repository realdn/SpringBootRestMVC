/**
 * 
 */
package com.example.mvc_205.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.mvc_205.model.Order;

/**
 * @author bjit
 *
 */
@Service
public class OrderService {
	ArrayList<Order> orderList = new ArrayList<Order>();
	
	public ArrayList<Order> addOrder(Order order)
	{		
		orderList.add(order);
		return orderList;
		
	}
	
	
	public ArrayList<Order> getAllOrders()
	{		
		if (orderList.size()<1) {
			Order order = new Order(1L,"FirstOrder",100);
			orderList.add(order);
			
		}
		return orderList;
		
	}
	
}
 