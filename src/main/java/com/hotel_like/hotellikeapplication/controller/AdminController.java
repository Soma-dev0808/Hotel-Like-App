package com.hotel_like.hotellikeapplication.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hotel_like.hotellikeapplication.dao.iReservationRepository;
import com.hotel_like.hotellikeapplication.entity.Reservation;

@Controller
public class AdminController {

    @Autowired
    iReservationRepository reservationRepository;

    @GetMapping("/admin")
    public String showLogin(Model model) {

        List<Reservation> reserves = reservationRepository.findAll();

        System.out.println(reserves);

        // List<Reservation> reserves = new ArrayList<>();

        // for (int i = 1; i <= 10; i++) {
        // Reservation r = new Reservation(
        // 1,
        // "test1",
        // 123,
        // new Date(System.currentTimeMillis()),
        // 2,
        // 1231323,
        // "asda@dadas.com");

        // r.setReservNo(i);

        // reserves.add(r);

        // }

        model.addAttribute("reservatoins", reserves);
        return "admin/admin.html";
    }

    @PutMapping("/admin/update")
    public String updateReservation(Reservation reservation, Model model) {
        reservationRepository.save(reservation);
        return "redirect:/employee/new";
    }
}
