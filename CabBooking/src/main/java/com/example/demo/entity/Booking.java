package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer B_id;
	private String pickLocation;
	private String dropLocation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	public Integer getB_id() {
		return B_id;
	}

	public void setB_id(Integer b_id) {
		B_id = b_id;
	}

	public String getPickLocation() {
		return pickLocation;
	}
	
	public void setPickLocation(String pickLocation) {
		this.pickLocation = pickLocation;
	}
	
	public String getDropLocation() {
		return dropLocation;
	}
	
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Location [id=" + B_id + ", pickLocation=" + pickLocation + ", dropLocation=" + dropLocation + "]";
	}
}
