package com.hotel_like.hotellikeapplication.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@NonNull
	private int reservNo;
	@NonNull
	private int roomType;
	@NonNull
	private String reservName;
	@NonNull
	private int userId;
	@NonNull
	private Date startDate;
	@NonNull
	private Date endDate;
	@NonNull
	private String strStartDate;
	@NonNull
	private String strEndDate;
	@NonNull
	private int stayPeople;
	@NonNull
	private int phoneNumber;
	@NonNull
	private String email;

	public Reservation() {

	}

	public Reservation(
			int roomType,
			String reservName,
			int userId,
			Date startDate,
			Date endDate,
			String strStartDate,
			String strEndDate,
			int stayPeople,
			int phoneNumber,
			String email) {
		this.roomType = roomType;
		this.reservName = reservName;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.strStartDate = strStartDate;
		this.strEndDate = strEndDate;
		this.stayPeople = stayPeople;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
     * getter : reservNo
     * @return reservNo
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
     * @return roomType
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
     * @return reservName
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
     * getter : startDate
     * @return startDate
     */
	public Date getStartDate() {
		return startDate;
	}
	
	/**
     * setter : startDate
     * @param startDate
     */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	/**
     * getter : endDate
     * @return endDate
     */
	public Date getEndDate() {
		return endDate;
	}
	
	/**
     * setter : endDate
     * @param endDate
     */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	/**
     * getter : stayPeople
     * @return stayPeople
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
     * @return phoneNumber
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

	/**
     * getter : strStartDate
     * @return strStartDate
     */
	public String getStrStartDate() {
		return strStartDate;
	}

	/**
     * setter : strStartDate
     * @param strStartDate
     */
	public void setStrStartDate(String strStartDate) {
		this.strStartDate = strStartDate;
	}

	/**
     * getter : strEndDate
     * @return reservNo
     */
	public String getStrEndDate() {
		return strEndDate;
	}
	
	/**
     * setter : strEndDate
     * @param strEndDate
     */
	public void setStrEndDate(String strEndDate) {
		this.strEndDate = strEndDate;
	}
}
