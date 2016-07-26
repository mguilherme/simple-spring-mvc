package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "forward:/home";
    }

    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "Spring MVC 4");
        return "home";
    }
}
