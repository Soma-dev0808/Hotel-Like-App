package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "user")
public class User {
	@Id
	@NonNull
	private int userId;
	@NonNull
    private String userType;
	@NonNull
    private String userName;
	@NonNull
    private int password;
	@NonNull
    private String email;

    public User() {
    }

    public User(
    		int userId, 
    		String userType, 
    		String userName, 
    		int password, 
    		String email) {
    	this.userType = userType;
    	this.userName = userName;
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
     * getter : userName
     * @return userName
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
