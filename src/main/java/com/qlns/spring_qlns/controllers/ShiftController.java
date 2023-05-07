package com.qlns.spring_qlns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ShiftController {
    @GetMapping({"/shift" })
    public ModelAndView shift()
    {
        ModelAndView mv = new ModelAndView("public/shift");
        return mv;
    }
}
