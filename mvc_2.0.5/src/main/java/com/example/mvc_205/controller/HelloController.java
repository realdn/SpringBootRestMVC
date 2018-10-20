package com.example.mvc_205.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvc_205.model.*;

@RestController
public class HelloController {
	
	ArrayList<Order> orderList = new ArrayList<Order>();
	
	@GetMapping("/order")
	public List<Order> getOrder()
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(3434L, "New Order", 1));
		
		return orderList;
	}
	
	

	
	@DeleteMapping("/order/{id}")
	public String deleteOrder(@PathVariable Long id)
	{		
		return "deleted with id :"+id;
	}
	
	@PutMapping("/order/{id}")
	public List<Order> updateOrder(@RequestBody Order order, @PathVariable Long id)
	{
		order.setId(id);
		orderList.add(order);
		
		return orderList;
	}
	
	@PostMapping("/order")
	public List<Order> PostOrder(@RequestBody Order newOrder)
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(newOrder);
		
		return orderList;
	}
	
	
	

}
