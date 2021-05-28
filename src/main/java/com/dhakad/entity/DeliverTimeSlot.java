package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DeliverTimeSlot {

	@Id
	private int deliverTimeId;
	private String timeSlot;
	@OneToOne(mappedBy = "deliverTimeSlot")
	private Order_Table order_table;
	
}
