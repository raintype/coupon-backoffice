package com.raintype.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("auth")
public class AuthController {

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public void loginGet(){

    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public void loginPOST(HttpSession session, Model model) throws Exception{


    }
}
