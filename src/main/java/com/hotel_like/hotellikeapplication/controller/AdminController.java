package com.hotel_like.hotellikeapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

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

    @PutMapping("/admin/update")
    public String updateReservation(Reservation reservation, Model model) {
        reservationRepository.save(reservation);
        return "redirect:/employee/new";
    }
}
