package com.formvalidation.serversideformvalidation.controller;


import com.formvalidation.serversideformvalidation.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/login")
    public String openForm(Model model){
        model.addAttribute("user",new User());
        return "form";
    }

    @PostMapping("/submit")
    public String onSubmit(@Valid @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult);
            return "form";
        }
        System.out.println(user);
        return "success";
    }
}
