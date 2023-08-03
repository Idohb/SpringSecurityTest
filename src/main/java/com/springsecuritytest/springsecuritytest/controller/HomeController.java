package com.springsecuritytest.springsecuritytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//    /*pour je ne sais quelles raisons, j'ai eu une erreur d'index et ma solution était de le mettre en commentaire*/
//    @GetMapping("/")
//    public String greeting() {
//        return "index";
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/manager")
    public String manager() {
        return "manager";
    }

    @GetMapping("/employee")
    public String employee() {
        return "employee";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
