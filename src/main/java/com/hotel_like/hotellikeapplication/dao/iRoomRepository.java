package com.hotel_like.hotellikeapplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hotel_like.hotellikeapplication.entity.Room;

public interface iRoomRepository  extends CrudRepository<Room, Integer>{

	/**
	 * get all room list
	 */
	@Override
	List<Room> findAll();
	
	/**
	 * get a room data
	 * @param roomType
	 */
	@Query(nativeQuery = true, value = "SELECT *  FROM room r WHERE r.room_type = :roomType")
	public Room getRoomDataByRoomType(@Param("roomType")int roomType);
}
