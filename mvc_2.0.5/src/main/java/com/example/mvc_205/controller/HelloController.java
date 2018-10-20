package com.example.mvc_205.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvc_205.model.*;
import com.example.mvc_205.service.OrderService;

@RestController
public class HelloController {
	
	@Autowired
	private OrderService orderSrvice;
	
	@GetMapping("/order")
	public List<Orders> getOrder()
	{			
		return orderSrvice.getAllOrders();
	}
	
	

	
	@DeleteMapping("/order/{id}")
	public String deleteOrder(@PathVariable Long id)
	{		
		return "deleted with id :"+id;
	}
	
	@PutMapping("/order/{id}")
	public List<Orders> updateOrder(@RequestBody Orders order, @PathVariable Long id)
	{
	
		return orderSrvice.addOrder(order);
	}
	
	@PostMapping("/order")
	public List<Orders> PostOrder(@RequestBody Orders newOrder)
	{
		return orderSrvice.addOrder(newOrder);
	}
	
	
	

}
