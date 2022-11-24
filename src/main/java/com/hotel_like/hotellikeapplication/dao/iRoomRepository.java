package com.hotel_like.hotellikeapplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.hotel_like.hotellikeapplication.entity.Room;

public interface iRoomRepository  extends CrudRepository<Room, Integer>{

	/**
	 * get all reservaiton list
	 */
	//public List<Room> getAllRoomInfo();
}
