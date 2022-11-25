package com.hotel_like.hotellikeapplication.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel_like.hotellikeapplication.dao.iReservationRepository;
import com.hotel_like.hotellikeapplication.entity.Reservation;

@Controller
public class ReservationController {
	@Autowired
	iReservationRepository reservationRepository;
	
	public static Integer maxNo;
	/**
	 * display Reservation Page
	 * @param model
	 * @throws Exception 
	 */
	@GetMapping("/user/reservation")
    public String displayReservationPage(Model model, Integer userId, Integer roomType) throws Exception{
	//public String displayReservationPage(Model model) throws Exception{
		model.addAttribute("reserv", new Reservation());
//		model.addAttribute("userId", userId);
//		model.addAttribute("roomType", roomType);
		
		model.addAttribute("userId", 1);
		model.addAttribute("roomType", 3);
		
		setMinAndMaxDate(model);
        return "user/reservation";
    }
	
	
	/**
	 * make and insert a reservation
	 * @param reservation
	 * @param model
	 * @throws ParseException 
	 */
	@PostMapping("/user/reservation")
    public String makeReservation(Reservation reservation, 
    							  Integer options,
    							  Integer userId, 
    							  Integer roomType,  
    							  Model model) throws ParseException{
		
		//set reservation information
		reservation.setUserId(userId);
		reservation.setRoomType(roomType);
		reservation.setStayPeople(options);
		
		//set staying term with changing String to Date
		reservation.setStartDate(setStringToDate(reservation.getStrStartDate())); 
		reservation.setEndDate(setStringToDate(reservation.getStrEndDate())); 
        
		//count reservation data
		maxNo = reservationRepository.getCount(); 
		reservation.setReservNo(maxNo + 1);
		
		//insert new reservation
        reservationRepository.save(reservation);
        return "user/completed";
    }
	
	
	/**
	 * display Completed page
	 * @param reservation
	 * @param model
	 */
	@GetMapping("/user/completed")
    public String displayCompletedPage(Model model){
        return "user/completed";
    }
	
	
	/**
	 * show a reservation detail
	 * @param reservation
	 * @param model
	 */
	@PostMapping("/user/completed")
    public String backMainMenu(Reservation reservation, Integer page, Model model){
		// checking for move page
		String momePage = "";
		if(page == 0)
			momePage = showReservationDetail(model);
		else if(page == 1)
			momePage = "user/admin";
		
		return momePage;
    }
	
	
	/**
	 * show a reservation detail
	 * @param reservation
	 * @param model
	 */
	@GetMapping("/user/confirmation")
    public String showReservationDetail(Model model){
		// get a reservation 
		Reservation reservation = reservationRepository.getReservation(maxNo + 1);
		
		model.addAttribute("reserv", reservation);
		//model.addAttribute("reservNo", reservation.getReservNo());
		
		// formatting staying term
		model.addAttribute("stayDate", reservation.getStrStartDate() + " ~ " +reservation.getStrEndDate()); 
		
        return "user/confirmation";
    }
	
	
	/**
	 * change String to Date type
	 * @param strDate
	 * @return stayDate
	 * @throws ParseException 
	 */
	public Date setStringToDate(String strDate) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
        Date date = dateFormat.parse(strDate); 
		return date;
	}
	
	
	/**
	 * stetting staying term is one year 
	 */
	public void setMinAndMaxDate(Model model) throws Exception {
        Timestamp nowDttm = new Timestamp(System.currentTimeMillis());

        // Change to Date type
        Date dt = new Date(nowDttm.getTime());

        // set min Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        model.addAttribute("minDate", sdf.format(nowDttm));

       // Calendar
        Calendar cal = Calendar.getInstance();
        
        // add 1 year
        cal.setTime(dt);
        cal.add(Calendar.YEAR, 1);
        model.addAttribute("maxDate", sdf.format(cal.getTime()));
	}
}
