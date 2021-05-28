package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class My {

	@Id
	private int mId;
	private String mName;
}
