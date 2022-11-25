package com.hotel_like.hotellikeapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
	@Id
	private int roomType;
	private int roomFlg;
	
	public Room() {
		
	}
	
	public Room(int roomType, int roomFlg) {
		this.roomType = roomType;
		this.roomFlg = roomFlg;
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
	public Integer getRoomFlg() {
		return roomFlg;
	}
	
	/**
     * setter : roomName
     * @param roomName
     */
	public void setRoomFlg(Integer roomFlg) {
		this.roomFlg = roomFlg;
	}
}
