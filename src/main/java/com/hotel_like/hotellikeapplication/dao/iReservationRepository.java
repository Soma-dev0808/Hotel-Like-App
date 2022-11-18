package com.hotel_like.hotellikeapplication.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hotel_like.hotellikeapplication.entity.Reservation;

public interface iReservationRepository  extends CrudRepository<Reservation, Integer>{
	
	/**
	 * get all reservaiton list
	 */
	public List<Reservation> getAllReservList();
	
	/**
	 * get a reservaiton information
	 * @param reservNo
	 * @param roomType
	 */
	Reservation getReservInfo(Integer reservNo, int roomType);
}
