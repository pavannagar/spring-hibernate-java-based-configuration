package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Status {

	@Id
	private int statusId;
	private String statusValue;
	@OneToOne(mappedBy = "status")
	private Order_Table order_table;
}
