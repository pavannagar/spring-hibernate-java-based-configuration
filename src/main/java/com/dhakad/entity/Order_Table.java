package com.dhakad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Order_Table {

	@Id
	private int orderId;
	
	private int deliveryCharge;
	private int amount;
	private String orderDate;
	private String deliveryDate;
	@ManyToOne
	private Customer customer;
	@OneToOne
	private Status status; 
	@OneToOne
	private PickUpTimeSlot pickUpTimeSlot;
	@OneToOne
	private DeliverTimeSlot deliverTimeSlot;
	@OneToMany(mappedBy = "order_table")
	private List<OrderItem> orderItem;
	
	
	
	
}
