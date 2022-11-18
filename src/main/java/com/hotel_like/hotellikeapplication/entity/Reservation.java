package com.hotel_like.hotellikeapplication.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservNo;
	
	private int roomType;
	private String reservName;
	private int userId;
	private Date reservDate;
	private int stayPeople;
	private int phoneNumber;
	private String email;
	
	public Reservation() {
		
	}
	
	public Reservation(int roomType, String reservName, int userId, Date reservDate, int stayPeople, int phoneNumber, String email) {
		this.roomType = roomType;
		this.reservName = reservName;
		this.userId = userId;
		this.reservDate = reservDate;
		this.stayPeople = stayPeople;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	/**
     * getter : reservNo
     * 
     */
	public int getReservNo() {
		return reservNo;
	}
	
	/**
     * setter : reservNo
     * @param reservNo
     */
	public void setReservNo(int reservNo) {
		this.reservNo = reservNo;
	}
	
	/**
     * getter : roomType
     * 
     */
	public int getRoomType() {
		return roomType;
	}
	
	/**
     * setter : roomType
     * @param roomType
     */
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	
	/**
     * getter : reservName
     * 
     */
	public String getReservName() {
		return reservName;
	}
	
	/**
     * setter : reservName
     * @param reservName
     */
	public void setReservName(String reservName) {
		this.reservName = reservName;
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
     * getter : reservDate
     * 
     */
	public Date getReservDate() {
		return reservDate;
	}
	
	/**
     * setter : reservDate
     * @param reservDate
     */
	public void setReservDate(Date reservDate) {
		this.reservDate = reservDate;
	}
	
	/**
     * getter : stayPeople
     * 
     */
	public int getStayPeople() {
		return stayPeople;
	}
	
	/**
     * setter : stayPeople
     * @param stayPeople
     */
	public void setStayPeople(int stayPeople) {
		this.stayPeople = stayPeople;
	}
	
	/**
     * getter : phoneNumber
     * 
     */
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
     * setter : phoneNumber
     * @param phoneNumber
     */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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
