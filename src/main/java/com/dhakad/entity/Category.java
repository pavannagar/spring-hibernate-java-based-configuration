package com.dhakad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private int categoryId;
	private String categoryName;
	@OneToMany(mappedBy = "category")
	private List<Ratelist> ratelist;
	
	
	
	
}
