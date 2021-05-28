package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PickUpTimeSlot {

	@Id
	private int pickUpTimeId;
	private String timeSlot;
	@OneToOne(mappedBy = "pickUpTimeSlot")
	private Order_Table order_table;
}
