package com.ManhDo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(){
        return "login";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "hellothere";
    }

    @RequestMapping("/processFormVersion2")
    public String Introduce(@RequestParam("username") String theName, Model model){

        return "hellothere";
    }
}
