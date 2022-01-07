package com.ManhDo.controller;

import com.ManhDo.classes.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String showForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @RequestMapping("/ProcessRegister")
    public String ProcessRegister(@Valid @ModelAttribute("user") User user, BindingResult theBindingResult, Model model){

        if(user.Validate()){
        String result = "Fuck you " + user.getUsername();
        model.addAttribute("message",result);
        return "hellothere";}
        else {
            model.addAttribute("message","Password and confirm don't match each other!");
            return "register";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
}
