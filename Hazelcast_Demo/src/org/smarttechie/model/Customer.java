package org.smarttechie.model;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3196814940249199369L;
	private String userId;
	private String firstName;
	private String lastName;
	private String bio;
	
	public Customer(String userId, String firstName, String lastName, String bio) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
}
