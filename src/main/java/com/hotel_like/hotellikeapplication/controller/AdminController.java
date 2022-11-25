package com.hotel_like.hotellikeapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel_like.hotellikeapplication.dao.iReservationRepository;
import com.hotel_like.hotellikeapplication.dto.ReservationInfo;
import com.hotel_like.hotellikeapplication.entity.Reservation;

@Controller
public class AdminController {

    @Autowired
    iReservationRepository reservationRepository;

    @GetMapping("/admin")
    public String showLogin(Model model) {

        List<ReservationInfo> reserves = reservationRepository.getAllReservList();

        model.addAttribute("reservatoins", reserves);
        return "admin/admin.html";
    }

    @PostMapping("/admin/update/{id}")
    public String updateReservation(
            @PathVariable("id") Integer id,
            Reservation reservation)
            throws Exception {

        Reservation reserv = reservationRepository.findById(id).get();

        reserv.setReservName(reservation.getReservName());
        reserv.setStrStartDate(reservation.getStrStartDate());
        reserv.setStrEndDate(reservation.getStrEndDate());
        reserv.setStayPeople(reservation.getStayPeople());
        reserv.setPhoneNumber(reservation.getPhoneNumber());
        reserv.setEmail(reservation.getEmail());

        reservationRepository.save(reserv);

        return "redirect:/admin";
    }
}
