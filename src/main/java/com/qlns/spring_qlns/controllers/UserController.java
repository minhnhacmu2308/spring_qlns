package com.qlns.spring_qlns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping({"/user" })
    public ModelAndView user()
    {
        ModelAndView mv = new ModelAndView("public/user");
        return mv;
    }
}
