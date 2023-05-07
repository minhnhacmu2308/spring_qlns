package com.qlns.spring_qlns.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class AuthenticationController {
    @Autowired
    MessageSource messageSource;


    @GetMapping({"/login"})
    public ModelAndView loadHomePage()
    {
        ModelAndView mv = new ModelAndView("public/login");
        return mv;
    }

    @GetMapping({"/register"})
    public ModelAndView register()
    {
        ModelAndView mv = new ModelAndView("public/register");
        return mv;
    }
}
