package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "room")
public class Room {
	@Id
	@NonNull
	private int roomType;
	@NonNull
	private String roomName;
	
	public Room() {
		
	}
	
	public Room(int roomType, String roomName) {
		this.roomType = roomType;
		this.roomName = roomName;
	}
	
	/**
     * getter : roomType
     * @return  roomType
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
     * getter : roomName
     * @return  roomName
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
