package com.siri.learnspringboot.courses.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String author;
	
	public Course() {
	
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public String toString() {
		return "Course [id= " + id + ", name = " + name + ", author = just added for git" +author + "]";

		
	}
}
