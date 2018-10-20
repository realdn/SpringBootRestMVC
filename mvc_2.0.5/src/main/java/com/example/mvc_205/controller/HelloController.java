package com.example.mvc_205.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvc_205.model.*;

@RestController
public class HelloController {
	
	@GetMapping("/order")
	public List<Order> getOrder()
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(3434L, "New Order", 1));
		
		return orderList;
	}
	
	

	
	@DeleteMapping("/order")
	public List<Order> deleteOrder()
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(3434L, "New Order", 1));
		
		return orderList;
	}
	
	@PutMapping("/order")
	public List<Order> updateOrder()
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(3434L, "New Order", 1));
		
		return orderList;
	}
	
	@PostMapping("/order")
	public List<Order> PostOrder()
	{
		ArrayList<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(3434L, "New Order", 1));
		
		return orderList;
	}
	
	
	

}
