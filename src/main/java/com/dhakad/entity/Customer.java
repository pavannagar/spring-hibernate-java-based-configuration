package com.dhakad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	private int customerId;
	private String Name;
	private String email;
	private String password;
	private String mobileNumber1;
	private String mobileNumber2;
	private String address;
	private String state;
	private String district;
	private String city;
	private String pincode;
	private String houseNumber;
	private String street;
	private String landmark;
	@OneToMany(mappedBy = "customer")
	private List<Order_Table> order_table;
	
	
	
}
