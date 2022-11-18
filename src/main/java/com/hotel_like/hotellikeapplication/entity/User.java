package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
    private String userType;
    private String userName;
    private String email;

    public User() {
    }

    public User(String userType, String userName, String email) {
    	this.userType = userType;
    	this.userName = userName;
    	this.email = email;
    }
    
    /**
     * getter : userId
     * 
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
     * 
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
     * getter : userName
     * 
     */
	public String getUserName() {
		return userName;
	}

	/**
     * setter : userName
     * @param userName
     */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
     * getter : email
     * 
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
