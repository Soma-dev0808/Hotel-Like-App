package com.hotel_like.hotellikeapplication.dao;

import java.util.List;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotel_like.hotellikeapplication.dto.ReservationInfo;
import com.hotel_like.hotellikeapplication.entity.Reservation;

public interface iReservationRepository extends JpaRepository<Reservation, Integer> {

    /**
     * get all reservaiton list
     */
    @Query(nativeQuery = true, value = "SELECT r.reserv_no as reservNo, r.room_type as roomType, " +
            "r.reserv_name as reservName, r.user_id as userId, r.start_date as startDate, r.end_date as endDate," +
            "r.stay_people as stayPeople, r.phone_number as phoneNumber, r.email as email, rm.room_name as roomName " +
            "FROM reservation r " +
            "LEFT JOIN room rm " +
            "ON r.room_type = rm.room_type;")
    public List<ReservationInfo> getAllReservList();

    /**
     * get a reservaiton information
     * 
     * @param reservNo
     * @param roomType
     */
    // Reservation getReservInfo(Integer reservNo, int roomType);
}
