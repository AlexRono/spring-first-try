package com.rono.springfirsttry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping ("/")
    public String showHome(){

        return "home";
    }

}