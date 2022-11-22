package com.hotel_like.hotellikeapplication.dao;

import java.util.List;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel_like.hotellikeapplication.entity.Reservation;

public interface iReservationRepository extends JpaRepository<Reservation, Integer> {

    /**
     * get all reservaiton list
     */
    // public List<Reservation> getAllReservList();

    @Override
    public List<Reservation> findAll();

    /**
     * get a reservaiton information
     * 
     * @param reservNo
     * @param roomType
     */
    // Reservation getReservInfo(Integer reservNo, int roomType);
}
