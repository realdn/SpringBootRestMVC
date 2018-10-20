package com.example.mvc_205.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	 	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String orderNumber;
	private String orderType;

	protected Orders(){	}
	
	public Orders(String orderNumber, String orderType)	{		
		this.orderNumber = orderNumber;
		this.orderType = orderType;		
	}	
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, orderNumber, orderType);
    }

}
