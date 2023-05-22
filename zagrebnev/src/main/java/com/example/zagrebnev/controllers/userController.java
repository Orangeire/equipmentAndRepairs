package com.example.zagrebnev.controllers;

import com.example.zagrebnev.models.User;
import com.example.zagrebnev.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class userController {
    private final UserService userService;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/registration")
    public String createUSer(User user){
        userService.createUser(user);
        return "redirect:/login";
    }
    @GetMapping("/hello")
    public String securityUrl(){
        return "/hello";
    }
}

