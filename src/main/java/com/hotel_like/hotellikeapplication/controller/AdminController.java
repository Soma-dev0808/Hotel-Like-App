package com.hotel_like.hotellikeapplication.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hotel_like.hotellikeapplication.entity.Reservation;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String showLogin(Model model) {
        List<Reservation> reserves = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            reserves.add(
                    new Reservation(
                            1,
                            "test1",
                            123,
                            new Date(System.currentTimeMillis()),
                            2,
                            1231323,
                            "asda@dadas.com"));
        }

        model.addAttribute("reservatoins", reserves);
        return "admin/admin.html";
    }
}
