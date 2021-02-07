package com.hcl.phasethree.myfeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String comment;

	public Feedback() {

	}

	public Feedback(Integer id, String username, String comment) {
		super();
		this.id = id;
		this.username = username;
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", username=" + username + ", comment=" + comment + "]";
	}
	
	

}
