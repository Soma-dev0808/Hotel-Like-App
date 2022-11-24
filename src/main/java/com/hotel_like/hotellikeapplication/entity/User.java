package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	private int userId;
    private String userType;
    private int password;
    private String email;

    public User() {
    }

    public User(
    		int userId, 
    		String userType, 
    		int password, 
    		String email) {
    	this.userType = userType;
    	this.password = password;
    	this.email = email;
    }
    
    /**
     * getter : userId
     * @return userId
     */
	public int getUserId() {
		return userId;
	}

	/**
     * setter : userId
     * @param userId
     */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
     * getter : userType
     * @return userType
     */
	public String getUserType() {
		return userType;
	}

	/**
     * setter : userType
     * @param userType
     */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
     * getter : password
     * @return password
     */
	public int getPassword() {
		return password;
	}

	/**
     * setter : password
     * @param password
     */
	public void setPassword(int password) {
		this.password = password;
	}

	/**
     * getter : email
     * @return email
     */
	public String getEmail() {
		return email;
	}

	/**
     * setter : email
     * @param email
     */
	public void setEmail(String email) {
		this.email = email;
	}
}
