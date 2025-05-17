package com.pucp.lab5trivia.controller;

import com.pucp.lab5trivia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        userService.register(username, password);
        return "redirect:/login";
    }

    @GetMapping("/redirect")
    public String redirectByRole(Authentication auth) {
        if (auth.getAuthorities().toString().contains("ADMIN")) {
            return "redirect:/admin/users";
        } else {
            return "redirect:/user/trivia";
        }
    }
}
