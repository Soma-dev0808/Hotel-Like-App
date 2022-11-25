package com.hotel_like.hotellikeapplication.dao;

import java.util.List;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hotel_like.hotellikeapplication.dto.ReservationInfo;
import com.hotel_like.hotellikeapplication.entity.Reservation;

public interface iReservationRepository extends JpaRepository<Reservation, Integer> {

        /**
         * get all reservaiton list
         */
        @Query(nativeQuery = true, value = "SELECT r.reserv_no as reservNo, r.room_type as roomType, " +
                        "r.reserv_name as reservName, r.user_id as userId, r.str_start_date as strStartDate, r.str_end_date as strEndDate,"
                        +
                        "r.stay_people as stayPeople, r.phone_number as phoneNumber, r.email as email, rm.room_name as roomName "
                        +
                        "FROM reservation r " +
                        "LEFT JOIN room rm " +
                        "ON r.room_type = rm.room_type ORDER BY r.reserv_no;")
        public List<ReservationInfo> getAllReservList();

        /**
         * get a count
         */
        @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM reservation;")
        public int getCount();

        /**
         * get a reservaiton
         * 
         * @param reservNo
         */
        @Query(nativeQuery = true, value = "SELECT *  FROM reservation r WHERE r.reserv_no = :reservNo")
        public Reservation getReservation(@Param("reservNo") int reservNo);
}
