/**
 * 
 */
package com.example.mvc_205.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvc_205.model.Orders;
//import com.example.mvc_205.repository.OrderRepository;
import com.example.mvc_205.repository.OrderRepository;

/**
 * @author bjit
 *
 */
@Service
public class OrderService {
	ArrayList<Orders> orderList = new ArrayList<Orders>();
	
	@Autowired
	private OrderRepository orderRepository;
	
	public ArrayList<Orders> addOrder(Orders order)
	{		
		orderList.add(order);
		return orderList;
		
	}
	
	
	public ArrayList<Orders> getAllOrders()
	{		
		if (orderList.size()<1) {
			Orders order = new Orders("FirstOrder","100");
			orderList.add(order);
			
		}
		
		Boolean isTrue = orderRepository.existsById(1L);
		System.out.println("Id Exist");
		return orderList;
		
	}
	
}
 