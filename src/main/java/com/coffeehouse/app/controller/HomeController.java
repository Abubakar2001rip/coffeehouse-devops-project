package com.coffeehouse.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("shopName", "BrewBean");
        model.addAttribute("shopSubtitle", "COFFEE HOUSE");
        return "index";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("shopName", "BrewBean");
        model.addAttribute("shopSubtitle", "COFFEE HOUSE");
        return "menu";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("shopName", "BrewBean");
        model.addAttribute("shopSubtitle", "COFFEE HOUSE");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("shopName", "BrewBean");
        model.addAttribute("shopSubtitle", "COFFEE HOUSE");
        return "contact";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("shopName", "BrewBean");
        model.addAttribute("shopSubtitle", "COFFEE HOUSE");
        return "cart";
    }
}

