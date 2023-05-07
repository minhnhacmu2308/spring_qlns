package com.qlns.spring_qlns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FormController {

    @GetMapping({"/form" })
    public ModelAndView form()
    {
        ModelAndView mv = new ModelAndView("public/form");
        return mv;
    }
}
