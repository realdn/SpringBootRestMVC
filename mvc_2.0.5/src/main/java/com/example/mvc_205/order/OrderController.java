package com.example.mvc_205.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/order")
	public String order()
	{
		return "Order count 0";
		
	}
	
}
