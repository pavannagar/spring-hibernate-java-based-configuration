package com.dhakad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cloth {

	@Id
	private int clothId;
	private String clothName;
	@OneToMany(mappedBy = "cloth")
	private List<Ratelist> ratelist;
	
}
