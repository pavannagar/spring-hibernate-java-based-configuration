package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ratelist {

	@Id
	private int id;
	private int price;
	@ManyToOne
	private Category category;
	@ManyToOne
	private Cloth cloth;
	
	
	
	
}
