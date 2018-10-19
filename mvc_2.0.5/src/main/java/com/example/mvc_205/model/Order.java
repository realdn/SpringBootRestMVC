/**
 * 
 */
package com.example.mvc_205.model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

/**
 * @author ts-mdshariful.islam
 *
 */
//@Entity
public class Order {
//	@Id
//	@GeneratedValue
	private long id;
	private String orderNumber;
	private int orderType;

	public Order()
	{
		super();
	}
	
	public Order(Long id, String orderNuber, int orderType)
	{
		
		this.setId(id);
		this.setOrderNumber(orderNuber);
		this.setOrderType(orderType);		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}



}
