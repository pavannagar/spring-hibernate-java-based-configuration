package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	@Id
	private int id;
	private int categoryId;
	private int clothId;
	private int price;
	private int quantity;
	@ManyToOne 
	private Order_Table order_table;
	
	
	
}
