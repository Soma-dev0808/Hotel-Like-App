package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "room")
public class Room {
	@Id
	private int roomType;
	
	private String roomName;
	
	public Room() {
		
	}
	
	public Room(int roomType, String roomName) {
		this.roomType = roomType;
		this.roomName = roomName;
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
	
	/*
     * getter : roomName
     * 
     */
	public String getRoomName() {
		return roomName;
	}
	
	/**
     * setter : roomName
     * @param roomName
     */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
}
