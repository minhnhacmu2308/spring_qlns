package com.qlns.spring_qlns.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping({"/" , "/index"})
    public ModelAndView home()
    {
        ModelAndView mv = new ModelAndView("public/home");
        return mv;
    }
}
