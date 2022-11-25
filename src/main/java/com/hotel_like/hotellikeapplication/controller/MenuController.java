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
import com.hotel_like.hotellikeapplication.dao.iRoomRepository;
import com.hotel_like.hotellikeapplication.dto.ReservationInfo;
import com.hotel_like.hotellikeapplication.entity.Reservation;
import com.hotel_like.hotellikeapplication.entity.Room;

@Controller
public class MenuController {

    @Autowired
    iRoomRepository roomRepository;

    @Autowired
    iReservationRepository reservationRepository;

    @GetMapping("/user/menu")
    public String checkReserved(Model model) {
        int room1 = 0;
        int room2 = 0;
        int room3 = 0;
        int room4 = 0;
        int room5 = 0;
        List<Room> roomList = roomRepository.findAll();
        for(Room room : roomList){
            switch(room.getRoomType()){ 
                case 1:
                    if(room.getRoomFlg() == 1) //getRoomName()...roomFlgになる
                        room1 = 1;
                break;
                case 2:
                    if(room.getRoomFlg() == 1) //roomFlgになる
                        room2 = 1;
                break;
                case 3:
                    if(room.getRoomFlg() == 1) //roomFlgになる
                        room3 = 1;
                break;
                case 4:
                    if(room.getRoomFlg() == 1) //roomFlgになる
                        room4 = 1;
                break;
                case 5:
                    if(room.getRoomFlg() == 1) //roomFlgになる
                        room5 = 1;
                break;
            }
        }
        model.addAttribute("room1", room1);
        model.addAttribute("room2", room2);
        model.addAttribute("room3", room3);
        model.addAttribute("room4", room4);
        model.addAttribute("room5", room5);

        return "user/menu";
    }
}