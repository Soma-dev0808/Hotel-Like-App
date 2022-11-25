package com.hotel_like.hotellikeapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.hotel_like.hotellikeapplication.dao.iAuthRepository;
import com.hotel_like.hotellikeapplication.entity.User;

@Controller
public class UserController {

    @Autowired
    iAuthRepository authRepository;

    @GetMapping("/user/login")
    public String getLogin(Model model) {
        model.addAttribute("user", new User());
        return "user/login";
    }

    @PostMapping("/user/login")
    public String postLogin(User user, Integer check, Model model) {
        User userData = authRepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
        if (userData != null) {
        if (userData.getUserType().equals("c")) {
            System.out.println("Here is working");
            return "redirect:/user/menu";
        } else {
            return "redirect:/admin";
        }
        } else {
            return "redirect:login";
        }  
    }

    @GetMapping("/user/signup")
    public String getSignup(Model model) {
        model.addAttribute("user", new User());
        return "user/signup";
    }

    @PostMapping("/user/signup")
    public String postSignup(User user, Model model) {
        int userMaxNo = (int) authRepository.count();
        user.setUserId(userMaxNo);
        user.setUserType("c");
        authRepository.save(user);
        return "redirect:/user/menu";
    }
}