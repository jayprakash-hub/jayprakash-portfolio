package com.Jp.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/About.html")
    public String about() {
        return "About";
    }

    @GetMapping("/Skills.html")
    public String skills() {
        return "Skills";
    }

    @GetMapping("/Experience.html")
    public String experience() {
        return "Experience";
    }

    @GetMapping("/Projects.html")
    public String projects() {
        return "Projects";
    }

    @GetMapping("/Achievements.html")
    public String achievements() {
        return "Achievements";
    }

    @GetMapping("/Education.html")
    public String education() {
        return "Education";
    }

    @GetMapping("/Contact.html")
    public String contact() {
        return "Contact";
    }

    @GetMapping("/login.html")
    public String login() {
        return "login";
    }

    @GetMapping("/register.html")
    public String register() {
        return "register";
    }
}