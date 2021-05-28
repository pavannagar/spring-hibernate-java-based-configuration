package com.dhakad.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
public class Book {

	@Id
	@Max(value= 1001 ,message = "value must be less than 1001")
	private int id;
	@Size(max = 10, message = "maximum 10 character")
	private String name;
	@Size(max = 20, message = "maximum 20 character")
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	

	
	
}
